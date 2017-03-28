#### dev_HazeBankCreditSystem
Api to calculate Instalment of Credit and generate PDF raport

### Require
- Maven
- Java SE7

### How to start?
Use this command in repository folder.
``` 
mvn jetty:run 
```
#### BackEnd:

### Package:

- Service : logical application layer.
- domainModel : Model.
- Servelets: View.

### Service Class:
 - ServiceMenager     :  Menagment services.
 - ValidateService    :  Validate output data Model. 
 - ConvertService     :  Convert output data to Object Credit.
 - CalculateService   :  Calculate Instalment.
 - PdfBuilderService  :  Create PDF raport.
 -RowsBuilderService  :  Set object to cell and add to List rows.
 
### View:
 - responseHTML -> Build Table.
 - responsePDF -> Build PDF.
#### FrontEnd:

### Modules:
- ExceptionService : build Exception.
- AjaxService: AJAX service;
- RenderService: Inject to view.
- ValidatorService: valid input value.
