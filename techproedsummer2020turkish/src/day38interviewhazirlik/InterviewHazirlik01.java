package day38interviewhazirlik;

public class InterviewHazirlik01 {
	
	/*
	 
	  1) Java "Platform independent" programlama dilidir.
	  Yani herhangi bir platformda yazilan java kodu diger platformlarda
	  da calisir.
	  Mesela kodu Mac'de yazsak windows'ta da calisir.
	  
	  2) IDE==> Integrated Development Environment demektir. Eclips ve IntelliJ
	  piyasada kullanilan meshur iki IDE'dir.
	  
	  3) Constructor==> Yeni bir obje üretilirken Constructor aktive olur ve objeyi
	  üretir. 
	  				    Return type'i yoktur.
	  				    Ismi class ismi ile ayni olmalidir.
	  				    Obje üretmek icin Constructor üretmek zorunda degiliz cünkü
	  		java her class icin default bir constructor üretmistir.
	  					Default Constructorlar parametresizdir.
	  					Biz herhangi bir Constructor ürettigimizde Default Constructorlar
	  		yok olur.
	  					Constructorlar overload edilebilir.
	  					Constructorlar child classlardan cagrilabilir ama override edilemezler.
	  					
	  					
	  4) OOP Concept nedir? 
	  					OOP Concept a)Inheritance
	  								b)Encapsulation
	  								c)Polymorphism
	  								d)Abstraction
	  								e)Interface icerir
	  								
	  
	  5) Inheritance nedir?
	  				    Inheritance parent(super class)-child(subclass) iliskisidir.
	  				    A classi B classina extends ederse A child olur B parent olur.
	  				    A classi B interface'ine implements ederse A child olur B parent olur
	  				    A interface'i B interface'ine extends eder A child olur B parent olur
	  				    Child parent'taki kodlarin public ve protected olanlarini kullanabilir.	
	  				    Reusability, short coding, maintenance faydalari vardir.
	  				    
	  				      
	  6) Encapsulation nedir?
	  					Data hiding'dir.(Data gizlemedir). Data'lar private yapilarak gizlenir.
	  					Gizlenen datalar getter ile okunur setter ile update edilir.
	  					Degistirilmesini istemedigimiz kodlari koruma altina almak icin kullanilir.
	  					Maintenance faydasi da vardir.
	  					Kodun hic degistirilmesini istemez sadece okunmasini istersek setter eklemez
	  					sadece getter methodlar ekleriz.
	  					Setter olusturulmayan classlara immutable class denir.
	  					
	  
	  7) Polimorfizm nedir?
	  					
	  					Polimorfizm overloading ve overriding'dir.
	  					
	  8) Abstract Class nedir?
	  
	  					Abstract Class üretmek icin abstract keyword kullanilir.
	  					Abstract Classlardan obje üretilemez.(instantiate yapilamaz)
	  					Abstract classlarda hem abstract hem de concrete methodlar bulunabilir.
	  					Abstract methodun oldugu class kesinlikle abstract olmak zorundadir.
	  					Abstract methodlarin(bodysiz) concrete child'lar tarafindan override edilme
	  					zorunlulugu vardir. Concreteler override edilmese de olur.
	  				==> Mutlaka söyle:	Abstract class'i child classlari bazi görevleri yapmak 
	  					zorunda birakmak icin olustururuz
	  					
	  	
	  9) Interface nedir?
	  
	  					Java normalde multiple inheritance'a müsaade etmez. Bu yüzden abstract class
	  					kullandigimizda multiple inheritance yapamayiz. Fakat bazi projelerde multiple
	  					inheritance kullanmak zorunda kaliriz. Bunu Java bize Interface kullanma hakki 
	  					vererek halletmistir. Cünkü interfacelere multiple implements/extends yapilabilir.
	  					Detaylari eclipsten bakilabilir.
	  					
	  					
	  10) Overloading nedir?
	  
	  					Method ismi ayni tutularak parametrelerin sayilari, yerleri veya data tipleri
	  					degistirilerek methodlar olusturmaktir.
	  					Overloading Compile Time'dir. Yani overloading'de yapilan hata kod yazarken 
	  					belli olur.
	  					Ayni isme sahip methodlarla farkli islemler yapabilmek icin
	  					Mesela substring(4) ve substring(4,7) methodlarinin fonksiyonlari esasinda
	  					aynidir. Ikisi de bir stringin belli bir bölümünü almaya yarar. Fakat bazi
	  					durumlarda bitis indexini söylemek gerekir. Bazi durumlarda gerekmez. Bunun 
	  					icin parametreleri farklilastiririz. Bu da overloadingi dogurur.
	  					
	  					
	  11) Overriding nedir?
	  
	  					Method Signature'a(method ismi+parametre) dokunmuyoruz, sadece body'yi degistiriyoruz.
	  					Overriding inheritance ile olur.
	  					Ayni methodun farkli kullanimlari icin overriding gereklidir.
	  					Overriding RunTime Error verir
	  					
	  12) Array ile ArrayList arasindaki farklar nelerdir?
	  
	  					Array olusturulurken uzunlugu belli edilmek zorundadir ve daha sonra uzunluk
	  					degistirilemez fakat ArrayList'lerde baslangicta uzunluk belirtme zorunlulugumuz yoktur.
	  					Eleman ekledikce uzunluk artar, sildikce uzunluk azalir.
	  					
	  					
	  13) String ile StringBuilder arasindaki fark nedir?
	  
	  					Stringler immutable'dir, StringBuilder ise mutable'dir.
	  					StringBuilder Class'i daha fazla kullanisli methodlara sahiptir. Mesela reverse
	  					methodu.				    
	  
	 
	 */

}
