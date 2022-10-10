package overriding;

public class main {
public static void main(String[] args) {
	BaseKrediManager[] baseKredi=new BaseKrediManager[] {			
new TarimKrediManager(),new OgrenciKrediManager(),new OgretmenKrediManager()
	};
	
	for (BaseKrediManager baseKrediManager : baseKredi) {
		System.out.println(baseKrediManager.hesapla(1000));
	}
}
}
