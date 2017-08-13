#include<stdio.h>
main()
{
    int con,r,c,i,j,a=0,b=0,search;
    int arr[6][6],sum[4][4],ne[3][3];
printf("1: do you want to enter 6*6 ");
printf("\nELSE: if you want to use predefined values ");
printf("\nplease enter your choice ");
scanf("%d",&con);

if(con==1)
{
   for(i=0;i<6;i++)
    {
        for(j=0;j<6;j++)
        {
          scanf("%d",&arr[i][j]);
while(arr[i][j]>9)
          {
              printf("re-input ");
              scanf("%d",&arr[i][j]);

          }
            while(arr[i][j]<-9)
          {
              printf("re-input ");
              scanf("%d",&arr[i][j]);

          }
       }
    }
}
else
{
arr[0][0]=1;
arr[0][1]=3;
arr[0][2]=2;
arr[0][5]=2;
arr[1][0]=1;
arr[1][1]=5;
arr[1][2]=1;
arr[1][3]=6;
arr[1][4]=6;
arr[1][5]=1;
arr[2][0]=1;
arr[0][3]=1;
arr[0][4]=1;
arr[2][1]=2;
arr[2][2]=1;
arr[2][3]=2;
arr[5][0]=5;
arr[5][1]=1;
arr[5][2]=6;
arr[5][3]=1;
arr[5][4]=7;
arr[5][5]=8;
arr[2][4]=1;
arr[2][5]=9;
arr[3][0]=1;
arr[3][1]=1;
arr[3][2]=1;
arr[3][3]=1;
arr[3][4]=1;
arr[3][5]=1;
arr[4][0]=1;
arr[4][1]=1;
arr[4][2]=1;
arr[4][3]=1;
arr[4][4]=1;
arr[4][5]=1;
}

for(i=0;i<6;i++)
{
    for(j=0;j<6;j++)
    {
        printf("%d",arr[i][j]);
    }
    printf("\n");
}
for(r=0;r<4;r++)
    {
        for(c=0;c<4;c++)
        {
            sum[r][c]=0;
            for(i=r,a=0;i<(r+3),a<3;i++,a++)
            {
                for(j=c,b=0;j<(c+3),b<3;j++,b++)

                {
                    ne[a][b]=arr[i][j];
                   if(a==1&&b==0)
                   {
                       ne[a][b]=0;
                   }
                   if(a==1&&b==2)
                   {
                       ne[a][b]=0;
                   }
                   else{
                    sum[r][c]=sum[r][c]+ne[a][b];
                    printf("%d",ne[a][b]);
                   }
}
printf("\n");
}
printf("\n%d\n",sum[r][c]);
}
}
printf("\n\n");
search=sum[0][0];
for(i=0;i<4;i++)
    {
        for(j=0;j<4;j++)
        {
            if(search<sum[i][j])
            {
                search=sum[i][j];
                a=i;
                b=j;
            }
        }
    }
    printf("\n\n the max hour glass is \n");
    for(i=a,r=0;i<(a+3),r<3;i++,r++)
{
    for(j=b,c=0;j<(b+3),c<3;j++,c++)
    {
     if(r==1&&c==0)
       {
        printf(" ");
        }
        //if(r==1&&c==1)
        //{
       // printf(" ");
       // }
         if(r==1&&c==1)
        {
        printf("      ");
        }
                   else
                   {
                       printf("%d",arr[i][j]);
                   }
    }
    printf("\n");
    }
printf("\n\nsum of max hourglass   %d",search);
printf("\n\n\n\n\n");
}
