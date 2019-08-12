package sendToCXP;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

public class StartClass {
    public static void main(String[] args) {
        String filePath = "/home/DN230483ZAV2/Trash/column_width_example.pdf";
        String clientID = "1004410776";
        String groupID = "51820907";
        //String format = "html";
        String format = "pdf";
        String sidValue = "190802csb2wqy6ncsktn";
        String ticketId = "0000001584528117";
        byte[] inputFile = null;

        try {
            inputFile = Files.readAllBytes(Paths.get(filePath));

        } catch (Exception e) {
            e.printStackTrace();
        }
        byte[] encodedBytes = Base64.getEncoder().encode(inputFile);
        String dataBase64 = new String(encodedBytes);

        //System.out.println(CXPOperation.write(dataBase64, clientID, groupID, format, sidValue));
        System.out.println(CXPOperation.getUrlForAttach(ticketId, sidValue));

/*

        String 		  send = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>" +
                "<cxp>" +
                "<obtainv1req creator=\"INFOKVIT\" vddoc=\"3274\">" +
                "<atsr id=\"35\" value=\"160218\"/>" +
                "<atsr id=\"603\" value=\"3061303\"/>" +
                "<scbo id=\"0\" srvcust=\"NRM\">" +
                "<busop id=\"355\"/>" +
                "</scbo>" +
                "</obtainv1req>" +
                "</cxp>";

        String dateBase64 = null;
        String dataHTML = "<html><head><meta charset='utf-8'> </head><body style = 'background-color: white;'><h3 align = 'center'>Судження щодо формування групи 8429949</h3><h3 align = 'center'>I. Відносини контролю</h3><p align='center'>1. Умови включення в групу</p><table align='center' border='1' cellpadding='5' style=';border-collapse: collapse; border: 1px solid black; color: black;'><tbody><tr><th>№</th><th>Назва критерію</th></tr><tr><td>1</td><td>Контрагенти  мають спільного контролера</td></tr><tr><td>2</td><td>Один з контрагентів здійснює контроль над іншим (іншими) контрагентом (контрагентами)</td></tr></tbody></table><br><br><p align='center'>2. Перевірка долі контролю/опосередкованої участі > 50%</p><table align='center' border='1' cellpadding='5' style='border-collapse: collapse; border: 1px solid black; color: black;'> <tbody> <tr> <th rowspan='2'>№</th> <th colspan='2'>Контролер</th> <th colspan='2'>Контрагент (який контролюється)</th> <th rowspan='2'>Вид участі(бенефіціар, акціонер)</th> <th rowspan='2'>Частка участі (володіння), %</th> </tr> <tr> <th>Назва контрагента</th> <th>ЄДРПОУ / ІПН</th> <th>Назва контрагента</th> <th>ЄДРПОУ / ІПН</th> </tr><tr><td align = 'center'>1</td><td align = 'center'>БОЖОК ГРИГОРИЙ НИКИФОРОВИЧ                        </td><td align = 'center'>1995708679</td><td align = 'center'>ТОВ АСТРА ТОВАРИСТВО З ОБМЕЖЕНОЮ ВIДПОВIДАЛЬНIСТЮ </td><td align = 'center'>21394227  </td><td align = 'center'>Бенефіціар</td><td align = 'center'>100</td></tr> <tr><td align = 'center'>2</td><td align = 'center'>БОЖОК ГРИГОРИЙ НИКИФОРОВИЧ                        </td><td align = 'center'>1995708679</td><td align = 'center'>ТОВ ЩОРССIЛЬГОСПСЕРВIС СIЛЬСЬКОГОСПОДАРСЬКЕ ТОВАРИ</td><td align = 'center'>31835079  </td><td align = 'center'>Акціонер</td><td align = 'center'>50</td></tr> <tr><td align = 'center'>3</td><td align = 'center'>БОЖОК ГРИГОРИЙ НИКИФОРОВИЧ                        </td><td align = 'center'>1995708679</td><td align = 'center'>ТОВ ЩОРССIЛЬГОСПСЕРВIС СIЛЬСЬКОГОСПОДАРСЬКЕ ТОВАРИ</td><td align = 'center'>31835079  </td><td align = 'center'>Бенефіціар</td><td align = 'center'>100</td></tr> </tbody> </table><br><br><p align='center'>3. Визначення посадових осіб* органів управління товариства</p><table  align='center' border='1' cellpadding='5' style=';border-collapse: collapse; border: 1px solid black; color: black;'><tbody><tr><th>№</th><th>ПІБ посадової особи</th><th>ІПН</th><th>Роль</th><th>Назва організації</th><th>ЄДРПОУ організації</th></tr><tr><td align = 'center'>1</td><td align = 'center'>БОЖОК ГРИГОРИЙ НИКИФОРОВИЧ                        </td><td align = 'center'>1995708679</td><td align = 'center'>Ген. директор</td><td align = 'center'>ТОВ АСТРА ТОВАРИСТВО З ОБМЕЖЕНОЮ ВIДПОВIДАЛЬНIСТЮ </td><td align = 'center'>21394227  </td></tr> <tr><td align = 'center'>2</td><td align = 'center'>БОЖОК ГРИГОРИЙ НИКИФОРОВИЧ                        </td><td align = 'center'>1995708679</td><td align = 'center'>Директор</td><td align = 'center'>ТОВ ЩОРССIЛЬГОСПСЕРВIС СIЛЬСЬКОГОСПОДАРСЬКЕ ТОВАРИ</td><td align = 'center'>31835079  </td></tr> </tbody> </table><p align='center'>*Посадові особи органів управління товариства - Керівник, Голова НР, Член правління, Член НР, Керівники та члени виконавчого органу</p><h3 align = 'center'>II. Відносини економічної залежності</h3><p align='center'>1. Таблиця формування груп пов'язаних контрагентів за відносинами економічної залежності</p><table  align='center' border='1' cellpadding='5' style=';border-collapse: collapse; border: 1px solid black; color: black;'><tbody><tr><th>№</th><th>Назва контрагента 1</th><th>ЄДРПОУ \\ ІПН 1</th><th>Назва контрагента 2</th><th>ЄДРПОУ \\ ІПН 2</th><th>Критерії зв'язку (№ пунктів),   пояснення</th></tr><tr><td align = 'center'>1</td><td align = 'center'>ТОВ Астра                                         </td><td align = 'center'>21394227  </td><td align = 'center'>БОЖОК ГРИГОРІЙ НИКИФОРОВИЧ                        </td><td align = 'center'>1995708679</td><td align = 'center'>2</td></tr> </tbody></table><br><br><p align='center'>2. Критерії \n" +
                "формування груп пов'язаних контрагентів</p><table align='center' border='1' cellpadding='5' style=';border-collapse: collapse; border: 1px solid black; color: black;'><tbody><tr><th>№</th><th>Назва критерія</th></th></tr><tr><td>1</td><td>Контрагенти мають спільне джерело погашення кредиту та не мають інших джерел доходів, з яких можна повністю погасити кредит;</td></tr><tr><td>2</td><td>Один контрагент повністю або частково гарантує (поручається за) виконання зобов’язань іншого контрагента перед банком та настання гарантійного випадку може призвести до невиконання цим контрагентом своїх зобов’язань;</td></tr><tr><td>3</td><td>50% або більше надходжень від реалізації продукції (товарів, робіт, послуг) або витрат на оплату продукції (товарів, робіт, послуг) за останній звітний рік одного контрагента (контрагентів) становлять операції з іншим контрагентом, якого не можна швидко замінити;</td></tr><tr><td>4</td><td>Два чи більше контрагентів залежать від одного джерела отримання 50 і більше відсотків фінансування, яке не може бути швидко замінене (крім контрагентів, в яких основним джерелом фінансування є кошти державного або місцевого бюджету або фінансової установи, включаючи міжнародну);</td></tr><tr><td>5</td><td>Контрагент (контрагенти) використовує (використовують) кредитні кошти, що отримані від банку, для надання прямо або опосередковано позики/в користування іншому контрагенту або іншій фізичній чи юридичній особі;</td></tr><tr><td>6</td><td>Заставодавцем за зобов’язаннями контрагентів є одна й та сама особа, та/або особи, пов’язані між собою відносинами контролю;</td></tr><tr><td>7</td><td>50% або більше дебіторської заборгованості або зобов’язань одного контрагента за останній звітний рік, що складають суттєву частину балансу, стосується іншого контрагента та/або групи юридичних осіб, пов’язаних з контрагентом відносинами контролю;</td></tr><tr><td>8</td><td>Сума оборотів за дебетом чи кредитом поточних рахунків одного контрагента, відкритих у банку, за операціями з іншим контрагентом за рік перевищує 50% загальної суми оборотів за дебетом чи кредитом поточних рахунків відповідно за цей рік;</td></tr><tr><td>9</td><td>50% або більше надходжень від реалізації продукції (товарів, робіт, послуг) або витрат на оплату продукції (товарів, робіт, послуг) за останній звітний рік одного контрагента становлять операції з групою юридичних осіб, пов’язаних з контрагентом відносинами контролю, яких не можна швидко замінити;</td></tr><tr><td>10</td><td>Контрагенти мають у спільному використанні інформаційно-телекомунікаційні системи та/або розроблені однією з них, разом адмініструють чи управляють ними;</td></tr><tr><td>11</td><td>Контрагенти мають спільну або дуже близькі адреси місцезнаходження та/або спільну адресу мережі Інтернет (найменування веб-сайта/доменне ім’я/посилання на веб-сайт) (далі – електронна адреса) або електронну адресу, що є складовою електронної адреси, або включає повне/часткове найменування електронної адреси іншого контрагента та/або спільну бренд-платформу (схоже комерційне найменування та/або знак для товарів і послуг та/або будь-які інші позначення, за яким товари та послуги особи відрізняються від товарів та послуг інших юридичних осіб, що дає змогу вирізнити юридичну особу з-поміж інших та зіставляти діяльність цієї особи з діяльністю іншої юридичної особи);</td></tr><tr><td>12</td><td>Надання фінансової допомоги;</td></tr></tbody></table><br><br><h3 align = 'center'>Висновок</h3><p align='center'>Згідно з даними, що вказані вище, за відносинами контролю та економічної залежності формується наступна група:</p><table  align='center' border='1' cellpadding='5' style=';border-collapse: collapse; border: 1px solid black; color: black;'><tbody><tr><th>№</th><th>Назва Учасника групи</th><th>ЄДРПОУ / ІПН</th><th>Причина додавання в групу</th></tr><tr><th colspan='4'>За відносинами контролю:</th></tr><tr><td align = 'center'>1</td><td align = 'center'>БОЖОК ГРИГОРИЙ НИКИФОРОВИЧ                        </td><td align = 'center'>1995708679</td><td align = 'center'>автор групи - контролер</td></tr> <tr><td \n" +
                "align = 'center'>2</td><td align = 'center'>Ф-Я TEST TEST MCB_0309</td><td align = 'center'>21394227  </td><td align = 'center'>контрагент, що контролюється БОЖОК ГРИГОРИЙ НИКИФОРОВИЧ (21394227), Бенефіціар</td></tr> <tr><td align = 'center'>3</td><td align = 'center'>ТОВ ЩОРССIЛЬГОСПСЕРВIС СIЛЬСЬКОГОСПОДАРСЬКЕ ТОВАРИ</td><td align = 'center'>31835079  </td><td align = 'center'>контрагент, що контролюється БОЖОК ГРИГОРИЙ НИКИФОРОВИЧ (31835079), Бенефіціар</td></tr> <tr><td align = 'center'>4</td><td align = 'center'>ТОВ ЩОРССIЛЬГОСПСЕРВIС СIЛЬСЬКОГОСПОДАРСЬКЕ ТОВАРИ</td><td align = 'center'>31835079  </td><td align = 'center'>контрагент, що контролюється БОЖОК ГРИГОРИЙ НИКИФОРОВИЧ (31835079), доля участі 50%, Акціонер</td></tr> <tr><td align = 'center'>5</td><td align = 'center'>ТОВ АСТРА ТОВАРИСТВО З ОБМЕЖЕНОЮ ВIДПОВIДАЛЬНIСТЮ </td><td align = 'center'>21394227  </td><td align = 'center'>Ген. директор БОЖОК ГРИГОРИЙ НИКИФОРОВИЧ (1995708679)</td></tr> <tr><td align = 'center'>6</td><td align = 'center'>ТОВ ЩОРССIЛЬГОСПСЕРВIС СIЛЬСЬКОГОСПОДАРСЬКЕ ТОВАРИ</td><td align = 'center'>31835079  </td><td align = 'center'>Директор БОЖОК ГРИГОРИЙ НИКИФОРОВИЧ (1995708679)</td></tr> <tr><th colspan='4'>За відносинами економічної залежності:</th></tr><tr><td align = 'center'>7</td><td align = 'center'>ТОВ Астра                                         </td><td align = 'center'>21394227  </td><td align = 'center'>Зв'язок з БОЖОК ГРИГОРІЙ НИКИФОРОВИЧ (1995708679) за наступними критеріями - 2</td></tr> </tbody></table></body></html>";

        dataHTML = "<html><head><meta charset='utf-8'> </head><body style = 'background-color: white;'><h3 align = 'center'>Ñóäæåííÿ ùîäî ôîðìóâàííÿ ãðóïè 1004410776</h3><h3 align = 'center'>I. Â³äíîñèíè êîíòðîëþ</h3><p align='center'>1. Óìîâè âêëþ÷åííÿ â ãðóïó</p><table align='center' border='1' cellpadding='5' style=';border-collapse: collapse; border: 1px solid black; color: black;'><tbody><tr><th>¹</th><th>Íàçâà êðèòåð³þ</th></tr><tr><td>1</td><td>Êîíòðàãåíòè  ìàþòü ñï³ëüíîãî êîíòðîëåðà</td></tr><tr><td>2</td><td>Îäèí ç êîíòðàãåíò³â çä³éñíþº êîíòðîëü íàä ³íøèì (³íøèìè) êîíòðàãåíòîì (êîíòðàãåíòàìè)</td></tr></tbody></table><br><br><h3 align = 'center'>II. Â³äíîñèíè åêîíîì³÷íî¿ çàëåæíîñò³</h3><p align='center'>2. Êðèòåð³¿ ôîðìóâàííÿ ãðóï ïîâ'ÿçàíèõ êîíòðàãåíò³â</p><table align='center' border='1' cellpadding='5' style=';border-collapse: collapse; border: 1px solid black; color: black;'><tbody><tr><th>¹</th><th>Íàçâà êðèòåð³ÿ</th></th></tr><tr><td>1</td><td>Êîíòðàãåíòè ìàþòü ñï³ëüíå äæåðåëî ïîãàøåííÿ êðåäèòó òà íå ìàþòü ³íøèõ äæåðåë äîõîä³â, ç ÿêèõ ìîæíà ïîâí³ñòþ ïîãàñèòè êðåäèò;</td></tr><tr><td>2</td><td>Îäèí êîíòðàãåíò ïîâí³ñòþ àáî ÷àñòêîâî ãàðàíòóº (ïîðó÷àºòüñÿ çà) âèêîíàííÿ çîáîâ\u0092ÿçàíü ³íøîãî êîíòðàãåíòà ïåðåä áàíêîì òà íàñòàííÿ ãàðàíò³éíîãî âèïàäêó ìîæå ïðèçâåñòè äî íåâèêîíàííÿ öèì êîíòðàãåíòîì ñâî¿õ çîáîâ\u0092ÿçàíü;</td></tr><tr><td>3</td><td>50% àáî á³ëüøå íàäõîäæåíü â³ä ðåàë³çàö³¿ ïðîäóêö³¿ (òîâàð³â, ðîá³ò, ïîñëóã) àáî âèòðàò íà îïëàòó ïðîäóêö³¿ (òîâàð³â, ðîá³ò, ïîñëóã) çà îñòàíí³é çâ³òíèé ð³ê îäíîãî êîíòðàãåíòà (êîíòðàãåíò³â) ñòàíîâëÿòü îïåðàö³¿ ç ³íøèì êîíòðàãåíòîì, ÿêîãî íå ìîæíà øâèäêî çàì³íèòè;</td></tr><tr><td>4</td><td>Äâà ÷è á³ëüøå êîíòðàãåíò³â çàëåæàòü â³ä îäíîãî äæåðåëà îòðèìàííÿ 50 ³ á³ëüøå â³äñîòê³â ô³íàíñóâàííÿ, ÿêå íå ìîæå áóòè øâèäêî çàì³íåíå (êð³ì êîíòðàãåíò³â, â ÿêèõ îñíîâíèì äæåðåëîì ô³íàíñóâàííÿ º êîøòè äåðæàâíîãî àáî ì³ñöåâîãî áþäæåòó àáî ô³íàíñîâî¿ óñòàíîâè, âêëþ÷àþ÷è ì³æíàðîäíó);</td></tr><tr><td>5</td><td>Êîíòðàãåíò (êîíòðàãåíòè) âèêîðèñòîâóº (âèêîðèñòîâóþòü) êðåäèòí³ êîøòè, ùî îòðèìàí³ â³ä áàíêó, äëÿ íàäàííÿ ïðÿìî àáî îïîñåðåäêîâàíî ïîçèêè/â êîðèñòóâàííÿ ³íøîìó êîíòðàãåíòó àáî ³íø³é ô³çè÷í³é ÷è þðèäè÷í³é îñîá³;</td></tr><tr><td>6</td><td>Çàñòàâîäàâöåì çà çîáîâ\u0092ÿçàííÿìè êîíòðàãåíò³â º îäíà é òà ñàìà îñîáà, òà/àáî îñîáè, ïîâ\u0092ÿçàí³ ì³æ ñîáîþ â³äíîñèíàìè êîíòðîëþ;</td></tr><tr><td>7</td><td>50% àáî á³ëüøå äåá³òîðñüêî¿ çàáîðãîâàíîñò³ àáî çîáîâ\u0092ÿçàíü îäíîãî êîíòðàãåíòà çà îñòàíí³é çâ³òíèé ð³ê, ùî ñêëàäàþòü ñóòòºâó ÷àñòèíó áàëàíñó, ñòîñóºòüñÿ ³íøîãî êîíòðàãåíòà òà/àáî ãðóïè þðèäè÷íèõ îñ³á, ïîâ\u0092ÿçàíèõ ç êîíòðàãåíòîì â³äíîñèíàìè êîíòðîëþ;</td></tr><tr><td>8</td><td>Ñóìà îáîðîò³â çà äåáåòîì ÷è êðåäèòîì ïîòî÷íèõ ðàõóíê³â îäíîãî êîíòðàãåíòà, â³äêðèòèõ ó áàíêó, çà îïåðàö³ÿìè ç ³íøèì êîíòðàãåíòîì çà ð³ê ïåðåâèùóº 50% çàãàëüíî¿ ñóìè îáîðîò³â çà äåáåòîì ÷è êðåäèòîì ïîòî÷íèõ ðàõóíê³â â³äïîâ³äíî çà öåé ð³ê;</td></tr><tr><td>9</td><td>50% àáî á³ëüøå íàäõîäæåíü â³ä ðåàë³çàö³¿ ïðîäóêö³¿ (òîâàð³â, ðîá³ò, ïîñëóã) àáî âèòðàò íà îïëàòó ïðîäóêö³¿ (òîâàð³â, ðîá³ò, ïîñëóã) çà îñòàíí³é çâ³òíèé ð³ê îäíîãî êîíòðàãåíòà ñòàíîâëÿòü îïåðàö³¿ ç ãðóïîþ þðèäè÷íèõ îñ³á, ïîâ\u0092ÿçàíèõ ç êîíòðàãåíòîì â³äíîñèíàìè êîíòðîëþ, ÿêèõ íå ìîæíà øâèäêî çàì³íèòè;</td></tr><tr><td>10</td><td>Êîíòðàãåíòè ìàþòü ó ñï³ëüíîìó âèêîðèñòàíí³ ³íôîðìàö³éíî-òåëåêîìóí³êàö³éí³ ñèñòåìè òà/àáî ðîçðîáëåí³ îäí³ºþ ç íèõ, ðàçîì àäì³í³ñòðóþòü ÷è óïðàâëÿþòü íèìè;</td></tr><tr><td>11</td><td>Êîíòðàãåíòè ìàþòü ñï³ëüíó àáî äóæå áëèçüê³ àäðåñè ì³ñöåçíàõîäæåííÿ òà/àáî ñï³ëüíó àäðåñó ìåðåæ³ ²íòåðíåò (íàéìåíóâàííÿ âåá-ñàéòà/äîìåííå ³ì\u0092ÿ/ïîñèëàííÿ íà âåá-ñàéò) (äàë³ \u0096 åëåêòðîííà àäðåñà) àáî åëåêòðîííó àäðåñó, ùî º ñêëàäîâîþ åëåêòðîííî¿ àäðåñè, àáî âêëþ÷àº ïîâíå/÷àñòêîâå íàéìåíóâàííÿ åëåêòðîííî¿ àäðåñè ³íøîãî êîíòðàãåíòà òà/àáî ñï³ëüíó áðåíä-ïëàòôîðìó (ñõîæå êîìåðö³éíå íàéìåíóâàííÿ òà/àáî çíàê äëÿ òîâàð³â ³ ïîñëóã òà/àáî áóäü-ÿê³ ³íø³ ïîçíà÷åííÿ, çà ÿêèì òîâàðè òà ïîñëóãè îñîáè â³äð³çíÿþòüñÿ â³ä òîâàð³â òà ïîñëóã ³íøèõ þðèäè÷íèõ îñ³á, ùî äàº çìîãó âèð³çíèòè þðèäè÷íó îñîáó ç-ïîì³æ ³íøèõ òà ç³ñòàâëÿòè ä³ÿëüí³ñòü ö³º¿ îñîáè ç ä³ÿëüí³ñòþ ³íøî¿ þðèäè÷íî¿ îñîáè);</td></tr><tr><td>12</td><td>Íàäàííÿ \n" +
                "ô³íàíñîâî¿ äîïîìîãè;</td></tr></tbody></table><br><br><h3 align = 'center'>Âèñíîâîê</h3><p align='center'>Çã³äíî ç äàíèìè, ùî âêàçàí³ âèùå, çà â³äíîñèíàìè êîíòðîëþ òà åêîíîì³÷íî¿ çàëåæíîñò³ ôîðìóºòüñÿ íàñòóïíà ãðóïà:</p><table  align='center' border='1' cellpadding='5' style=';border-collapse: collapse; border: 1px solid black; color: black;'><tbody><tr><th>¹</th><th>Íàçâà Ó÷àñíèêà ãðóïè</th><th>ªÄÐÏÎÓ / ²ÏÍ</th><th>Ïðè÷èíà äîäàâàííÿ â ãðóïó</th></tr></tbody></table></body></html>";

        try {
            dateBase64 = Base64.getEncoder().encodeToString(dataHTML.getBytes("utf-8"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        send = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>" +
                "<cxp>" +
                    "<writereq data=\"" + dateBase64 + "\" creator=\"NRM\" ext=\"html\" vddoc=\"3274\">" +
                        "<atsr id=\"35\" value=\"772066\"/>" +   //atsr - добавляемые реквизиты, id="35" - clientID  (динамический)
                        "<atsr id=\"603\" value=\"8429949\"/>" +  //atsr - добавляемые реквизиты, id="603" - ID группы (динамический)
                        "<scbo id=\"0\" srvcust=\"GSK\">" +  //бизнес-операция
                            "<busop id=\"355\"/>" +  //номер бизнес-дела к бизнес-операции, в атрибуте id
                        "</scbo>" +
                    "</writereq>" +
                "</cxp>";
        //System.out.println(send);

        //send = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
//                "<cxp>\n" +
//                "    <verifyreq vddoc=\"1\">\n" +
//                "        <atsr id=\"17\" value=\"TEST\"/>\n" +
//                "        <atsr id=\"35\" value=\"030889\"/>\n" +
//                "        <scbo id=\"0\" srvcust=\"CIS\">\n" +
//                "            <busop id=\"42\"/>\n" +
//                "        </scbo>\n" +
//                "    </verifyreq>\n" +
//                "</cxp>";
//
//
//        send = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>" +
//                "<cxp>" +
//                "<obtainv1req creator=\"DN230483ZAV2\" vddoc=\"3274>" +
//                "<atsr id=\"35\" value=\"160218\"/>" +
//                "<atsr id=\"603\" value=\"3061303\"/>" +
//                "<scbo id=\"0\" srvcust=\"GSK\">" +
//                "<busop id=\"355\"/>" +
//                "</scbo>" +
//                "</obtainv1req>" +
//                "</cxp>";


        //System.out.println(send);
        String sidKey = "sid";
        String sidValue = "190729csb28g7onpit3x";

        String url = null;
                //url = "https://att.stage.it.loc/all/attachmentservice/obtain.xml";  //тестовый полигон
        //url = "https://att.stage.it.loc/all//attachmentservice/verify.xml";  //тестовый полигон
        //url = "https://att.privatbank.ua/all/attachmentservice/obtain.xml"; //резервирование
        url = "https://att.privatbank.ua/all/attachmentservice/write.xml";  //запись

        //String rez = NRMSession.PostHTTPSTest(url, send, sidKey, sidValue);
        //System.out.println(rez);

        url = "https://att.privatbank.ua/all/attachmentservice/geturlforattach.xml";  //получение ссылки на файл


        send = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
                "<cxp>\n" +
                "    <urlreq>\n" +
                "        <attachment id=\"0000001579153139\"/>\n" +
               "    </urlreq>\n" +
               "</cxp>";

        String rez = NRMSession.PostHTTPSTest(url, send, sidKey, sidValue);
        System.out.println(rez);
*/


        //String rez = NRMSession.PostHTTPSTest(url, send);
/*
        List<Integer> rules = new ArrayList<Integer>();
        rules.add(35); // № реквизита - ID клиента
        rules.add(17); // № реквизита - Фамилия

        List<String> values = new ArrayList<String>();
        values.add("ID клиента");
        values.add("Фамилия"   );
        AttachmentService srv = null;

        try {
            srv = CXPEntryPoint.getAttachmentServiceInstance(url, sidValue, "sdqw", "daewd");
        } catch (Exception e) {
            System.out.println("zaraza");
            e.printStackTrace();

        }

        try {

            Attachment attachment = srv.obtain(
                    rules                  // номера реквизитов
                    ,values                 // значения реквизитов
                    ,null
                    ,1                      // номер документа (Фото клиента)
                    ,null
                    ,"ldap-логин"           // сотрудник, от имени которого создаётся тикет
                    ,new SCBO(0
                            ,new BusOp(42) // номер бизнес-дела (Информация о клиенте)
                            ,"CIS"         // ПК, который создаёт тикет (ЕКБ)
                    )
            );

            //Attachment a = srv.verify(null,null, null,0, null, null,null);
        } catch (Exception e) {
            e.printStackTrace();
        }
*/
    }
}
