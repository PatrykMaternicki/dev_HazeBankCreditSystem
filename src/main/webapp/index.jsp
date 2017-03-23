<!DOCTYPE HTML>

<html>
    <head>
        <%@ page contentType="text/html; charset=UTF-8" %>
        <meta name='viewport' content='width=device-width, initial-scale=1.0'>
        <title>HazeBankCredit</title>
        <link href="CSS/style.min.css" rel="stylesheet" />
    </head>
    <body>
      <header>
        <p class="logo"><img src="Image/coin.png" class="logo_coin_size" alt="logo coin"></img>HazeBank Credit</p>
      </header>
    <main class="app">
        <p class="app_text"> Choose your Credit </p>
        <section>
            <form action="summary" method="post">
                <table>
                  <tbody>
                    <tr>
                <td><label>Kwota kredytu:</td><td><input type="text" name="summaryCredit" /></td></label>
                    </tr>
                    <tr>
                <td><label>Ilosc rat :</td><td><input type="text" name="stock" /></label></td>
                  </tr>
                  <tr>
                <td><label>Oprocentoanie:</td><td><input type="text" name="percentCredit" /></td></label>
                </tr>
                <tr>
                <td><label>Opłata stała:</td><td><input type="text" name="constantFee" /></td></label>
              </tr>
            </tbody>
          </table>
                <label>
                <select class="app_select" name="select">
                <option value="constant"> Rata Stała</option>
                <option value="less"> Rata malejąca </option>
                </select>
                </label>
                  <section class="app_buttons">
                  <div>
                  <p class="app_buttons_line"><button class="app_button" type="submit" name="getPdf" value="Get Pdf" /><img class="app_button_image_pdf" src="Image/button_pdf.jpg"></img></button></p><p class="app_buttons_line" >Pobierz PDF</p>
                </div>
                  <div class="app_buttons_row">
                  <p class="app_buttons_line"><button class="app_button" type="submit" name="getPdf" value="Send" /><img class="app_button_image_html" src="Image/button_html.png"></img></button></p><p class="app_buttons_line app_buttons_line_padding">Wyświetl Tabele</p>
                </div>
              </section>
            </form>
        </section>
    </main>
    <footer>

    </footer>
    </body>
</html>
