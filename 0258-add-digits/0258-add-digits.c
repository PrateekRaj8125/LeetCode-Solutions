int addDigits(int num) {
    while(num>9){
        int sum=0,nn=num;
        while(nn>0){
            sum+=(nn%10);
            nn/=10;
        }
        num=sum;
    }
    return  num;
}