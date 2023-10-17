<?php
if($_SERVER["REQUEST_METHOD"]=='POST')
{
    $ch=$_POST['op'];
    //a=array('a'=>1,'b'=>3);
    $arr1=array('a'=>1,'b'=>2,'c'=>3,'d'=>4,'e'=>6);
    $arr2=array('x'=>11,'y'=>52,'z'=>33,'p'=>4);
    switch($ch)
    {
        case 1:
            $x=array_chunk($arr1,2);
            echo "Array chunk :<br>";
            print_r($x);
            break;
        case 2:
            asort($arr2);
            echo "Sorting<br>";
            print_r($arr2);
            break;
        case 3:
            $y=array_merge($arr1,$arr2);
            echo "Merge element<br>";
            print_r($y);
            break;
        case 4:
            print_r(array_intersect($arr1,$arr2));
            break;

    }

}



?>