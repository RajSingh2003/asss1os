<?php
if($_SERVER['REQUEST_METHOD']=='POST')
{
    $n1=$_POST['n1'];
    $n2=$_POST['n2'];
    
    function mode($a,$b)
    {
        $c=$a%$b;
        echo "MOD=$c<br>";
    }
    function power($a,$b)
    {
        $x=pow($a,$b);
        echo "Power:$x<br>";
    }
    function summ($a)
    {
        $sum=0;
        for($i=0;$i<=$a;$i++)
            $sum+=$i;
        echo "Sum:$sum<br>";  
    }
    function fact($a)
    {
        $sum=1;
        for($i=1;$i<=$a;$i++)
            $sum*=$i;
        echo "Factorial:$sum<br>" ;   
    }

}
mode($n1,$n2);
power($n1,$n2);
summ($n1);
fact($n2);
?>