<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HazeBankCredit</title>
        <link href="CSS/style2.css" rel="stylesheet" /> 
    </head>
    <body>
    <header>
        <img class="logo" src="Image/owl_icon.jpg"></img>
    </header>
    <main>
        <p> Choose your Credit </p>
        <section>
            <form action="summary" method="post">
                <label>Kwota kredytu:<input type="text" name="summaryCredit" /></label>
                <label>Ilosc rat :<input type="text" name="stock" /></label>
                <label>Oprocentoanie:<input type="text" name="percentCredit" /></label>
                <label>Opłata stała:<input type="text" name="constantFee" /></label>
                <label>
                <select name="select">
                <option value="constant"> Rata Stała</option>
                <option value="less"> Rata malejąca </option>
                </select>
                </label>
                <label>
                 <input type="submit" name="getPdf" value="Get Pdf"/>
                </label>
                <label><input type="submit" name="getPdf" value="Send" /></label>
            </form>
        </section>
    </main>
    <footer>
        
    </footer>
    </body>
</html>
