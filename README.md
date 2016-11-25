# Question9and10

You will implement an application with the following explanation ... You are required
to use Hibernate during database operations.

Employee Table -> Fields: Name,Surname and Salary
Department Table -> Fields: Name,Description and Employee
Meetings Table -> Fields: Name,Description and Deparment

*An employee can belong to one deparment, deparments can join any meeting and can
also join meeting more than one.

Q10)Reconfigure Question 9 with using Spring Framework and Hibernate as a JPA
Implementation.

#Açıklama

Spring Boot Nedir?

Spring Boot, Spring tabanlı uygulama geliştirmenin en hızlı ve kolay yolu olması amacıyla geliştirilmiş bir frameworktür. Spring Boot sayesinde boilerplate yani basmakalıp kodlardan sıyrılıp, sadece ihtiyacımız olan kodu yazıyoruz (only write code that you need to). Spring Boot web sunucusu olarak Tomcat ve diğer birçok ek özellikle beraber geliyor.

Spring Boot’un sağladığı en büyük avantajlardan biri ise sizi herhangi bir XML konfigürasyonuyla uğraşmak zorunda bırakmaması.

Tasarım için Bootstrap kullanılmıştır.

Uygulama Gereksinimleri ve POM Dosyası

Spring Boot ile yazacağımız uygulamamız, Her sınıf MVC yapısı baz alınarak  model, dao, service ve controller siniflari hazirlanmiştir.  İlk olarak Employee kaydı alınmış daha sonra Department kaydına geçince kayıt atan kişi hem department ın ismi ve açıklamasını doldurduktan sonra Employee id sine göre gelen employee instance larından istediğini Department'a kayıt edilmiştir. Sonradan Department listelemesi yapılınca bu kısımda görülmüştür. Aynı şekilde Meetings bölümüde bu şekilde gerçekleştirilmiştir.

Proje de MySQL workbench de veritabanı hazırlanmıştır. Hazırlanan veritabanının ismi userdb dir. İstenildiği taktirde resources/application.properties dosyasından veritabanı ismi değiştirilebilir. Bu dosyada mysql ve hibernate konfigürasyonları bulunmaktadır.

Hibernate konfigürasyonu kullanılarak veritabanında tablonun oluşması kolaylaştırılmıştır. Aynı zamanda tablo içinde Column ların içi sql kodlarının karşmaşıklığından kurtulup Hibernate orm mantığıyla rahatlıkla doldurulmuştur.

resources/application.propertie dosyasında " spring.jpa.properties.hibernate.hbm2ddl.auto: update " özelliği ile tablolar oluşturulmuş ve daha sonra yapılan kayıtlar tablo içine doldurulmuştur.

ihtiyaç duyacağımız kütüphaneleri kullanabilmek için gerekli dependencyleri pom.xml dosyasına eklenmiştir.

#Not

ORM nedir?

ORM, Object Relational Mapping anlamına gelmektedir. O/R Mapping olarakta yazılabilir. ORM nedir diye bir soru soracak olursak şöyle bir cevap verebiliriz: “İlişkisel veritabanı (RDBMS) ile nesneye yönelik programlanın (OO) arasında bir tür köprü özelliği gören ve ilişkisel veritabanındaki bilgilerimizi yönetmek için, nesne modellerimizi kullandığımız bir tekniktir/metodtur”. Basite indirgemek istersek: “Nesnelerimizi ilişkisel veritabanındaki tablomuza bağlayan ve veri alış-verişini bizim için yapan bir tekniktir/metodtur”. ORM tekniği belli bir programlama diline bağlı değildir ve her OO dilinde yazılabilir/kullanılabilir.

#Proje Maven ile hazırlanmıştır.

Proje indirildikten sonra IDE'ye maven projesi olarak import edilip maven clean ve install komutları çalıştırılmalıdır. Gerekirse maven update yapılmalıdır. En son Application class'ı run edilmelidir.

Proje çalıştırılınca browserdan; http://localhost:8080/ adresinden CRUD işlemlerine başlayabilirsiniz.
