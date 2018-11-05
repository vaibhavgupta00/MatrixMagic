import java.util.Scanner;
class magician{
public static void main(String ag[]){
Scanner sc= new Scanner(System.in);
int a[][]= new int[4][4];
for(int i=0;i<=3;i++){
for(int j=0;j<=3;j++){
a[i][j]=j+1+4*i;
}
}

System.out.println("matrix see the volunteer AND chossen a no");
for(int i=0;i<=3;i++){
for(int j=0;j<=3;j++){
System.out.print(a[i][j]+" ");
}
System.out.println();
}

System.out.println("tell the row of first chossen no. ");
int n=sc.nextInt();

int f[]= new int[4];
for(int i=0;i<=3;i++){
f[i]=a[n-1][i];
}

System.out.println();
int b[][]= new int[4][4];
System.out.println(" second time show matrix ");
for(int i=0;i<=3;i++){
for(int j=0;j<=3;j++){
System.out.print(a[j][i]+" ");
b[i][j]=a[j][i];
}
System.out.println();
}

System.out.println("tell the row where is your chossen no. ");
int m=sc.nextInt();

int s[]= new int[4];
for(int i=0;i<=3;i++){
s[i]=b[m-1][i];
}

System.out.println();
int v=0;
for(int i=0;i<=3;i++){
	for(int j=0;j<=3;j++){
if(f[i]==s[j]){

	System.out.println(" your number is"+f[i]+"   I KNOW THIS WAS A MAGIC");
	v=0;
	break;
	
}else{
	V=1;
}
}
}
   if(v==1){
System.out.println("volunteer cheat");

}
	
}
}
