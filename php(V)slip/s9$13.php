<?php
if($_SERVER['REQUEST_METHOD']=='POST')
{
    $s1=$_POST['s1'];
    $ch=$_POST['op'];
    function length($str)
    {
        $l=strlen($str);
        $c=0;
        for($i=0;$i<$l;$i++)
        {
            $c++;
        }
        echo "String length=$c<br>";
    }
    function lowercase($str)
    {
        $x=strtolower($str);
        echo "lowercase <br>: $x";
        $y=ucwords($str);
        echo "Title case=$y<br>";
        
    }
    function pad($str)
    {
        echo "*" . $str . "*";
    }
    function white($str)
    {
        echo "remove leading white space<br> ".ltrim($str);
        echo "reverse : ".strrev($str);
    }

    switch($ch)
    {
        case 1:
            length($s1);
            break;
        case 2:
            lowercase($s1);
            break;  
        case 3:
            pad($s1);
            break;  
        case 4:
            white($s1);
            break;               
    }

}
?>