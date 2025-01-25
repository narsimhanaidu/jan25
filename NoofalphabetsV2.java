package pattern;

public class NoofalphabetsV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String data = "iygyiegqwjcvakhdbckbambhcwkb";
data = data.toLowerCase();
int[] count = new int[26];
for(int i=0;i<data.length();i++) {
	char ch = data.charAt(i);
	count[ch - 97]++;
		for(int i1=0;i1<26;i1++) {
			System.out.println((char)(i1+97)+"---->"+count[i1]);
		}
}
	}

}
