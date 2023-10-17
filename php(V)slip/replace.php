<?php
$bstr=$_POST['bstr'];
$sstr=$_POST['sstr'];
$num=$_POST['num'];
$pos=$_POST['pos'];
$ch=$_POST['op'];
if($ch==1)
{
    $res=substr_replace($bstr,'',$pos,$num);
    echo "result : $res";
}
else if($ch==2)
{
    $res=substr_replace($bstr,$sstr,$pos,0);
    echo "result : $res";
}
else if($ch==3)
{
    $res=substr_replace($bstr,$sstr,$pos);
    echo "result : $res";
}
?>