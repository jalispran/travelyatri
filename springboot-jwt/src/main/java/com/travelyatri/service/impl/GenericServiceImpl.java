package com.travelyatri.service.impl;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Service;

import com.travelyatri.app.codes.Travelyatri;
import com.travelyatri.service.GenericService;

/**
 * Created by nydiarra on 07/05/17.
 */
@Service
public class GenericServiceImpl implements GenericService {

	@Override
    public void sendEmail(String emailId, Travelyatri.EmailContext emailContext) throws AddressException, MessagingException {
		
//		SimpleMailMessage message = new SimpleMailMessage();
//		message.setTo("pranjalgore@gmail.com"); 
//        message.setSubject("travelyatri test"); 
//        message.setText("this is awesome");
//        emailSender.send(message);
		
    	   final String FROM = "support@travleyatri.co.in";
           final String SMTP_USERNAME = "support@travleyatri.co.in";
           final String SMTP_PASSWORD = "travelyatri@123";
           final String HOST = "smtpout.asia.secureserver.net";
           final int PORT = 465;
           
           Properties props = System.getProperties();
           props.put("mail.transport.protocol", "smtp");
           props.put("mail.smtp.port", PORT); 
           props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
           props.put("mail.smtp.host", HOST);
           props.put("mail.smtp.auth", "true");

           Session session = Session.getDefaultInstance(props);
           
           MimeMessage msg = new MimeMessage(session);
           msg.setFrom(new InternetAddress(FROM));
           msg.setRecipient(Message.RecipientType.TO, new InternetAddress(emailId));
           msg.setSubject("welcome to travelyatri");
           msg.setContent(getEmailBody(emailContext),"text/html");
           
           Transport transport = session.getTransport();
           transport.connect(HOST, SMTP_USERNAME, SMTP_PASSWORD);
           transport.sendMessage(msg, msg.getAllRecipients());
    }


    private String getEmailBody(Travelyatri.EmailContext emailContext) {
    	if(Travelyatri.EmailContext.WELCOME_EMAIL.equals(emailContext))
    		return "\n" + 
    				"<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>\n" + 
    				"<html xmlns='http://www.w3.org/1999/xhtml'>\n" + 
    				"\n" + 
    				"<head>\n" + 
    				"  <meta http-equiv='Content-Type' content='text/html; charset=UTF-8' />\n" + 
    				"  <title>Welcome</title>\n" + 
    				"  <meta name='viewport' content='width=device-width, initial-scale=1.0'/>\n" + 
    				"</head>\n" + 
    				"\n" + 
    				"<body bgcolor='#FFFFFF'>\n" + 
    				"  <table border='0' cellpadding='10' cellspacing='0' style=\n" + 
    				"  'background-color: #FFFFFF' width='100%'>\n" + 
    				"    <tr>\n" + 
    				"      <td>\n" + 
    				"        <!--[if (gte mso 9)|(IE)]>\n" + 
    				"      <table width='600' align='center' cellpadding='0' cellspacing='0' border='0'>\n" + 
    				"        <tr>\n" + 
    				"          <td>\n" + 
    				"    <![endif]-->\n" + 
    				"\n" + 
    				"        <table align='center' border='0' cellpadding='0' cellspacing='0' class=\n" + 
    				"        'content' style='background-color: #FFFFFF'>\n" + 
    				"          <tr>\n" + 
    				"            <td id='templateContainerHeader' valign='top' mc:edit='welcomeEdit-01'>\n" + 
    				"              <p style='text-align:center;margin:0;padding:0;'><img src=\n" + 
    				"              'http://c0185784a2b233b0db9b-d0e5e4adc266f8aacd2ff78abb166d77.r51.cf2.rackcdn.com/templates/cog-01.jpg'\n" + 
    				"              style='display:inline-block;'></p>\n" + 
    				"            </td>\n" + 
    				"          </tr>\n" + 
    				"\n" + 
    				"          <tr>\n" + 
    				"            <td align='center' valign='top'>\n" + 
    				"              <table border='0' cellpadding='0' cellspacing='0' class=\n" + 
    				"              'brdBottomPadd-two' id='templateContainer' width='100%'>\n" + 
    				"                <tr>\n" + 
    				"                  <td class='bodyContent' valign='top' mc:edit='welcomeEdit-02'>\n" + 
    				"                    <p>Hi there,</p>\n" + 
    				"\n" + 
    				"                    <h1><strong>Congratulations on signing up<br>\n" + 
    				"                    for Travelyatri!</strong></h1>\n" + 
    				"\n" + 
    				"                    <h3>Thanks for joining our community for travelers.\n" + 
    				"                    We're excited to share everything that we know about\n" + 
    				"                    travelling with you.</h3>\n" + 
    				"                  </td>\n" + 
    				"                </tr>\n" + 
    				"\n" + 
    				"                <tr align='top'>\n" + 
    				"                  <td class='bodyContentImage' valign='top'>\n" + 
    				"                    <table border='0' cellpadding='0' cellspacing='0'>\n" + 
    				"                      <tr>\n" + 
    				"                        <td align='left' style='margin:0;padding:0;' valign=\n" + 
    				"                        'top' width='50' mc:edit='welcomeEdit-03'>\n" + 
    				"                          <p style='margin-bottom:10px'><img src=\n" + 
    				"                          'http://c0185784a2b233b0db9b-d0e5e4adc266f8aacd2ff78abb166d77.r51.cf2.rackcdn.com/templates/img_profile.jpg'\n" + 
    				"                          style='display:block;'></p>\n" + 
    				"                        </td>\n" + 
    				"\n" + 
    				"                        <td align='left' style='width:15px;margin:0;padding:0;'\n" + 
    				"                        valign='top' width='15'>&nbsp;</td>\n" + 
    				"\n" + 
    				"                        <td align='left' style=\n" + 
    				"                        'margin:0;padding-top:10px;line-height:1;' valign=\n" + 
    				"                        'top' mc:edit='welcomeEdit-04'>\n" + 
    				"                          <h4><strong> Pranjal </strong></h4>\n" + 
    				"\n" + 
    				"                          <h5>Community Manager at COG</h5>\n" + 
    				"                        </td>\n" + 
    				"                      </tr>\n" + 
    				"                    </table>\n" + 
    				"                  </td>\n" + 
    				"                </tr>\n" + 
    				"              </table>\n" + 
    				"            </td>\n" + 
    				"          </tr>\n" + 
    				"\n" + 
    				"          <tr>\n" + 
    				"            <td align='center'>\n" + 
    				"\n" + 
    				"              <table border='0' cellpadding='0' cellspacing='0' class='brdBottomPadd-two ' id='templateContainerMiddle' width='100%'>\n" + 
    				"                <tr valign='top'>\n" + 
    				"                  <td align='center' class='bodyContentTicks'>\n" + 
    				"                    <table border='0' cellpadding='0' cellspacing='0' width='100%'>\n" + 
    				"\n" + 
    				"                      <tr valign='top'>\n" + 
    				"                        <td valign='top' mc:edit='welcomeEditImgFirst' style='width:19%;color:#505050;font-family:Helvetica;font-size:14px;padding-bottom:1.143em;'>\n" + 
    				"                          <p style=\n" + 
    				"                          'text-align:center;margin:0 0 15px 0;padding:0;'>\n" + 
    				"                          <img height='' src=\n" + 
    				"                          'http://c0185784a2b233b0db9b-d0e5e4adc266f8aacd2ff78abb166d77.r51.cf2.rackcdn.com/templates/circle.jpg'\n" + 
    				"                          style='display:block;' width='91'></p>\n" + 
    				"                        </td>\n" + 
    				"\n" + 
    				"                        <td valign='top' style='width:5%;'>&nbsp;</td>\n" + 
    				"\n" + 
    				"                        <td valign='top' mc:edit='welcomeEditTxtFirst' style='width:71%;color:#505050;font-family:Helvetica;font-size:14px;padding-top:0.714em;'>\n" + 
    				"                          <h3><strong>Complete your profile</strong></h3>\n" + 
    				"                          <h4>Take part in our free community. Connect with like minded marketers to exchange ideas. <a href='http://www.autopilothq.com/'>Learn more</a></h4>\n" + 
    				"                        </td>\n" + 
    				"\n" + 
    				"                        <td valign='top' style='width:5%;'>&nbsp;</td>\n" + 
    				"                      </tr>\n" + 
    				"\n" + 
    				"                      <tr valign='top'>\n" + 
    				"                        <td valign='top' mc:edit='welcomeEditImgFirst' style='width:19%;color:#505050;font-family:Helvetica;font-size:14px;padding-bottom:1.143em;'>\n" + 
    				"                          <p style=\n" + 
    				"                          'text-align:center;margin:0 0 15px 0;padding:0;'>\n" + 
    				"                          <img height='' src=\n" + 
    				"                          'http://c0185784a2b233b0db9b-d0e5e4adc266f8aacd2ff78abb166d77.r51.cf2.rackcdn.com/templates/circle.jpg'\n" + 
    				"                          style='display:block;' width='91'></p>\n" + 
    				"                        </td>\n" + 
    				"\n" + 
    				"                        <td valign='top' style='width:5%;'>&nbsp;</td>\n" + 
    				"\n" + 
    				"                        <td valign='top' mc:edit='welcomeEditTxtFirst' style='width:71%;color:#505050;font-family:Helvetica;font-size:14px;padding-top:0.714em;'>\n" + 
    				"                          <h3><strong>Compare Plans</strong></h3>\n" + 
    				"                          <h4>Flight plans are best practice methodologies to succeed with marketing automation faster. <a href='http://www.autopilothq.com/'>Learn more</a></h4>\n" + 
    				"                        </td>\n" + 
    				"\n" + 
    				"                        <td valign='top' style='width:5%;'>&nbsp;</td>\n" + 
    				"                      </tr>\n" + 
    				"\n" + 
    				"                      <tr valign='top'>\n" + 
    				"                        <td valign='top' mc:edit='welcomeEditImgFirst' style='width:19%;color:#505050;font-family:Helvetica;font-size:14px;padding-bottom:1.143em;'>\n" + 
    				"                          <p style=\n" + 
    				"                          'text-align:center;margin:0 0 15px 0;padding:0;'>\n" + 
    				"                          <img height='' src=\n" + 
    				"                          'http://c0185784a2b233b0db9b-d0e5e4adc266f8aacd2ff78abb166d77.r51.cf2.rackcdn.com/templates/circle.jpg'\n" + 
    				"                          style='display:block;' width='91'></p>\n" + 
    				"                        </td>\n" + 
    				"\n" + 
    				"                        <td valign='top' style='width:5%;'>&nbsp;</td>\n" + 
    				"\n" + 
    				"                        <td valign='top' mc:edit='welcomeEditTxtFirst'>\n" + 
    				"                          <h3><strong>Happy Journey!</strong></h3>\n" + 
    				"                          <h4>Our community is only as good as its members. Share Flight School with your friends. <a href='http://www.autopilothq.com/'>Learn more</a></h4>\n" + 
    				"                        </td>\n" + 
    				"\n" + 
    				"                        <td valign='top' style='width:5%;'>&nbsp;</td>\n" + 
    				"                      </tr>\n" + 
    				"\n" + 
    				"                    </table>\n" + 
    				"                  </td>\n" + 
    				"\n" + 
    				"                </tr>\n" + 
    				"              </table>\n" + 
    				"\n" + 
    				"            </td>\n" + 
    				"          </tr>\n" + 
    				"\n" + 
    				"          <tr>\n" + 
    				"            <td align='center' valign='top'>\n" + 
    				"              <!-- BEGIN BODY // -->\n" + 
    				"\n" + 
    				"              <table border='0' cellpadding='0' cellspacing='0' id=\n" + 
    				"              'templateContainerMiddleBtm' width='100%'>\n" + 
    				"                <tr>\n" + 
    				"                  <td class='bodyContent' valign='top' mc:edit='welcomeEdit-11'>\n" + 
    				"                    <h3><strong>Get a 20% discount on first booking</strong></h3>\n" + 
    				"\n" + 
    				"                    <h4>Exclusive to Flight School members, receive a 20%\n" + 
    				"                    discount on your Schoolforce ticket when you use the coupon\n" + 
    				"                    code FLIGHTSCHOOL.</h4><a class='blue-btn' href=\n" + 
    				"                    'http://travelyatri.co.in/'><strong>Login to travelyatri</strong></a>\n" + 
    				"                  </td>\n" + 
    				"                </tr>\n" + 
    				"              </table><!-- // END BODY -->\n" + 
    				"            </td>\n" + 
    				"          </tr>\n" + 
    				"\n" + 
    				"          <tr>\n" + 
    				"            <td align='center' class='unSubContent' id='bodyCellFooter' valign=\n" + 
    				"            'top'>\n" + 
    				"              <table border='0' cellpadding='0' cellspacing='0' id=\n" + 
    				"              'templateContainerFooter' width='100%'>\n" + 
    				"                <tr>\n" + 
    				"                  <td valign='top' width='100%' mc:edit='welcomeEdit-11'>\n" + 
    				"                    <p style='text-align:center;'><img src=\n" + 
    				"                    'http://c0185784a2b233b0db9b-d0e5e4adc266f8aacd2ff78abb166d77.r51.cf2.rackcdn.com/templates/cog-03.jpg'\n" + 
    				"                    style='margin:0 auto 0 auto;display:inline-block;'></p>\n" + 
    				"\n" + 
    				"                    <h6 style='text-align:center;margin-top: 9px;'>COG Inc</h6>\n" + 
    				"\n" + 
    				"                    <h6 style='text-align:center;'>589&#8203; Howard&#8203; Street&#8203;</h6>\n" + 
    				"\n" + 
    				"                    <h6 style='text-align:center;'>San&#8203; Francisco,&#8203; CA&#8203; 94105&#8203;</h6>\n" + 
    				"\n" + 
    				"                    <h6 style='text-align:center;margin-top: 7px;'><a href=\n" + 
    				"                    '--unsubscribe--'>unsubscribe</a></h6>\n" + 
    				"                  </td>\n" + 
    				"                </tr>\n" + 
    				"              </table>\n" + 
    				"            </td>\n" + 
    				"          </tr>\n" + 
    				"        </table><!--[if (gte mso 9)|(IE)]>\n" + 
    				"          </td>\n" + 
    				"        </tr>\n" + 
    				"    </table>\n" + 
    				"    <![endif]-->\n" + 
    				"      </td>\n" + 
    				"    </tr>\n" + 
    				"  </table>\n" + 
    				"\n" + 
    				"  <style type='text/css'>\n" + 
    				"\n" + 
    				"    span.preheader {\n" + 
    				"    display:none!important\n" + 
    				"    }\n" + 
    				"    td ul li {\n" + 
    				"      font-size: 16px;\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    /* /\\/\\/\\/\\/\\/\\/\\/\\/ CLIENT-SPECIFIC STYLES /\\/\\/\\/\\/\\/\\/\\/\\/ */\n" + 
    				"    #outlook a {\n" + 
    				"    padding:0\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    /* Force Outlook to provide a 'view in browser' message */\n" + 
    				"    .ReadMsgBody {\n" + 
    				"    width:100%\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    .ExternalClass {\n" + 
    				"    width:100%\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    /* Force Hotmail to display emails at full width */\n" + 
    				"    .ExternalClass,.ExternalClass p,.ExternalClass span,.ExternalClass font,.ExternalClass td,.ExternalClass div {\n" + 
    				"    line-height:100%\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    /* Force Hotmail to display normal line spacing */\n" + 
    				"    body,table,td,p,a,li,blockquote {\n" + 
    				"    -webkit-text-size-adjust:100%;\n" + 
    				"    -ms-text-size-adjust:100%\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    /* Prevent WebKit and Windows mobile changing default text sizes */\n" + 
    				"    table,td {\n" + 
    				"    mso-table-lspace:0;\n" + 
    				"    mso-table-rspace:0\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    /* Remove spacing between tables in Outlook 2007 and up */\n" + 
    				"    /* /\\/\\/\\/\\/\\/\\/\\/\\/ RESET STYLES /\\/\\/\\/\\/\\/\\/\\/\\/ */\n" + 
    				"    body {\n" + 
    				"    margin:0;\n" + 
    				"    padding:0\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    img {\n" + 
    				"    max-width:100%;\n" + 
    				"    border:0;\n" + 
    				"    line-height:100%;\n" + 
    				"    outline:none;\n" + 
    				"    text-decoration:none\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    table {\n" + 
    				"    border-collapse:collapse!important\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    .content {\n" + 
    				"    width:100%;\n" + 
    				"    max-width:600px\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    .content img {\n" + 
    				"    height:auto;\n" + 
    				"    min-height:1px\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    #bodyTable {\n" + 
    				"    margin:0;\n" + 
    				"    padding:0;\n" + 
    				"    width:100%!important\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    #bodyCell {\n" + 
    				"    margin:0;\n" + 
    				"    padding:0\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    #bodyCellFooter {\n" + 
    				"    margin:0;\n" + 
    				"    padding:0;\n" + 
    				"    width:100%!important;\n" + 
    				"    padding-top:39px;\n" + 
    				"    padding-bottom:15px\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    body {\n" + 
    				"    margin:0;\n" + 
    				"    padding:0;\n" + 
    				"    min-width:100%!important\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    #templateContainerHeader {\n" + 
    				"    font-size:14px;\n" + 
    				"    padding-top:2.429em;\n" + 
    				"    padding-bottom:.929em\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    #templateContainerFootBrd {\n" + 
    				"    border-bottom:1px solid #e2e2e2;\n" + 
    				"    border-left:1px solid #e2e2e2;\n" + 
    				"    border-right:1px solid #e2e2e2;\n" + 
    				"    border-radius:0 0 4px 4px;\n" + 
    				"    background-clip:padding-box;\n" + 
    				"    border-spacing:0;\n" + 
    				"    height:10px;\n" + 
    				"    width:100%!important\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    #templateContainer {\n" + 
    				"    border-top:1px solid #e2e2e2;\n" + 
    				"    border-left:1px solid #e2e2e2;\n" + 
    				"    border-right:1px solid #e2e2e2;\n" + 
    				"    border-radius:4px 4px 0 0;\n" + 
    				"    background-clip:padding-box;\n" + 
    				"    border-spacing:0\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    #templateContainerMiddle {\n" + 
    				"    border-left:1px solid #e2e2e2;\n" + 
    				"    border-right:1px solid #e2e2e2\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    #templateContainerMiddleBtm {\n" + 
    				"    border-left:1px solid #e2e2e2;\n" + 
    				"    border-right:1px solid #e2e2e2;\n" + 
    				"    border-bottom:1px solid #e2e2e2;\n" + 
    				"    border-radius:0 0 4px 4px;\n" + 
    				"    background-clip:padding-box;\n" + 
    				"    border-spacing:0\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    #templateContainerMiddleBtm .bodyContent {\n" + 
    				"    padding-bottom:2em\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    /**\n" + 
    				"    * @tab Page\n" + 
    				"    * @section heading 1\n" + 
    				"    * @tip Set the styling for all first-level headings in your emails. These should be the largest of your headings.\n" + 
    				"    * @style heading 1\n" + 
    				"    */\n" + 
    				"    h1 {\n" + 
    				"    color:#2e2e2e;\n" + 
    				"    display:block;\n" + 
    				"    font-family:Helvetica;\n" + 
    				"    font-size:26px;\n" + 
    				"    line-height:1.385em;\n" + 
    				"    font-style:normal;\n" + 
    				"    font-weight:400;\n" + 
    				"    letter-spacing:normal;\n" + 
    				"    margin-top:0;\n" + 
    				"    margin-right:0;\n" + 
    				"    margin-bottom:15px;\n" + 
    				"    margin-left:0;\n" + 
    				"    text-align:left\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    /**\n" + 
    				"    * @tab Page\n" + 
    				"    * @section heading 2\n" + 
    				"    * @tip Set the styling for all second-level headings in your emails.\n" + 
    				"    * @style heading 2\n" + 
    				"    */\n" + 
    				"    h2 {\n" + 
    				"    color:#2e2e2e;\n" + 
    				"    display:block;\n" + 
    				"    font-family:Helvetica;\n" + 
    				"    font-size:22px;\n" + 
    				"    line-height:1.455em;\n" + 
    				"    font-style:normal;\n" + 
    				"    font-weight:400;\n" + 
    				"    letter-spacing:normal;\n" + 
    				"    margin-top:0;\n" + 
    				"    margin-right:0;\n" + 
    				"    margin-bottom:15px;\n" + 
    				"    margin-left:0;\n" + 
    				"    text-align:left\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    /**\n" + 
    				"    * @tab Page\n" + 
    				"    * @section heading 3\n" + 
    				"    * @tip Set the styling for all third-level headings in your emails.\n" + 
    				"    * @style heading 3\n" + 
    				"    */\n" + 
    				"    h3 {\n" + 
    				"    color:#545454;\n" + 
    				"    display:block;\n" + 
    				"    font-family:Helvetica;\n" + 
    				"    font-size:18px;\n" + 
    				"    line-height:1.444em;\n" + 
    				"    font-style:normal;\n" + 
    				"    font-weight:400;\n" + 
    				"    letter-spacing:normal;\n" + 
    				"    margin-top:0;\n" + 
    				"    margin-right:0;\n" + 
    				"    margin-bottom:15px;\n" + 
    				"    margin-left:0;\n" + 
    				"    text-align:left\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    /**\n" + 
    				"    * @tab Page\n" + 
    				"    * @section heading 4\n" + 
    				"    * @tip Set the styling for all fourth-level headings in your emails. These should be the smallest of your headings.\n" + 
    				"    * @style heading 4\n" + 
    				"    */\n" + 
    				"    h4 {\n" + 
    				"    color:#545454;\n" + 
    				"    display:block;\n" + 
    				"    font-family:Helvetica;\n" + 
    				"    font-size:14px;\n" + 
    				"    line-height:1.571em;\n" + 
    				"    font-style:normal;\n" + 
    				"    font-weight:400;\n" + 
    				"    letter-spacing:normal;\n" + 
    				"    margin-top:0;\n" + 
    				"    margin-right:0;\n" + 
    				"    margin-bottom:15px;\n" + 
    				"    margin-left:0;\n" + 
    				"    text-align:left\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    h5 {\n" + 
    				"    color:#545454;\n" + 
    				"    display:block;\n" + 
    				"    font-family:Helvetica;\n" + 
    				"    font-size:13px;\n" + 
    				"    line-height:1.538em;\n" + 
    				"    font-style:normal;\n" + 
    				"    font-weight:400;\n" + 
    				"    letter-spacing:normal;\n" + 
    				"    margin-top:0;\n" + 
    				"    margin-right:0;\n" + 
    				"    margin-bottom:15px;\n" + 
    				"    margin-left:0;\n" + 
    				"    text-align:left\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    h6 {\n" + 
    				"    color:#545454;\n" + 
    				"    display:block;\n" + 
    				"    font-family:Helvetica;\n" + 
    				"    font-size:12px;\n" + 
    				"    line-height:2em;\n" + 
    				"    font-style:normal;\n" + 
    				"    font-weight:400;\n" + 
    				"    letter-spacing:normal;\n" + 
    				"    margin-top:0;\n" + 
    				"    margin-right:0;\n" + 
    				"    margin-bottom:15px;\n" + 
    				"    margin-left:0;\n" + 
    				"    text-align:left\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    p {\n" + 
    				"    color:#545454;\n" + 
    				"    display:block;\n" + 
    				"    font-family:Helvetica;\n" + 
    				"    font-size:16px;\n" + 
    				"    line-height:1.5em;\n" + 
    				"    font-style:normal;\n" + 
    				"    font-weight:400;\n" + 
    				"    letter-spacing:normal;\n" + 
    				"    margin-top:0;\n" + 
    				"    margin-right:0;\n" + 
    				"    margin-bottom:15px;\n" + 
    				"    margin-left:0;\n" + 
    				"    text-align:left\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    .unSubContent a:visited {\n" + 
    				"    color:#a1a1a1;\n" + 
    				"    text-decoration:underline;\n" + 
    				"    font-weight:400\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    .unSubContent a:focus {\n" + 
    				"    color:#a1a1a1;\n" + 
    				"    text-decoration:underline;\n" + 
    				"    font-weight:400\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    .unSubContent a:hover {\n" + 
    				"    color:#a1a1a1;\n" + 
    				"    text-decoration:underline;\n" + 
    				"    font-weight:400\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    .unSubContent a:link {\n" + 
    				"    color:#a1a1a1;\n" + 
    				"    text-decoration:underline;\n" + 
    				"    font-weight:400\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    .unSubContent a .yshortcuts {\n" + 
    				"    color:#a1a1a1;\n" + 
    				"    text-decoration:underline;\n" + 
    				"    font-weight:400\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    .unSubContent h6 {\n" + 
    				"    color:#a1a1a1;\n" + 
    				"    font-size:12px;\n" + 
    				"    line-height:1.5em;\n" + 
    				"    margin-bottom:0\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    .bodyContent {\n" + 
    				"    color:#505050;\n" + 
    				"    font-family:Helvetica;\n" + 
    				"    font-size:14px;\n" + 
    				"    line-height:150%;\n" + 
    				"    padding-top:3.143em;\n" + 
    				"    padding-right:3.5em;\n" + 
    				"    padding-left:3.5em;\n" + 
    				"    padding-bottom:.714em;\n" + 
    				"    text-align:left\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    .bodyContentImage {\n" + 
    				"    color:#505050;\n" + 
    				"    font-family:Helvetica;\n" + 
    				"    font-size:14px;\n" + 
    				"    line-height:150%;\n" + 
    				"    padding-top:0;\n" + 
    				"    padding-right:3.571em;\n" + 
    				"    padding-left:3.571em;\n" + 
    				"    padding-bottom:1.357em;\n" + 
    				"    text-align:left\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    .bodyContentImage h4 {\n" + 
    				"    color:#4E4E4E;\n" + 
    				"    font-size:13px;\n" + 
    				"    line-height:1.154em;\n" + 
    				"    font-weight:400;\n" + 
    				"    margin-bottom:0\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    .bodyContentImage h5 {\n" + 
    				"    color:#828282;\n" + 
    				"    font-size:12px;\n" + 
    				"    line-height:1.667em;\n" + 
    				"    margin-bottom:0\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    /**\n" + 
    				"    * @tab Body\n" + 
    				"    * @section body link\n" + 
    				"    * @tip Set the styling for your email's main content links. Choose a color that helps them stand out from your text.\n" + 
    				"    */\n" + 
    				"    a:visited {\n" + 
    				"    color:#3386e4;\n" + 
    				"    text-decoration:none;\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    a:focus {\n" + 
    				"    color:#3386e4;\n" + 
    				"    text-decoration:none;\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    a:hover {\n" + 
    				"    color:#3386e4;\n" + 
    				"    text-decoration:none;\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    a:link {\n" + 
    				"    color:#3386e4;\n" + 
    				"    text-decoration:none;\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    a .yshortcuts {\n" + 
    				"    color:#3386e4;\n" + 
    				"    text-decoration:none;\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    .bodyContent img {\n" + 
    				"    height:auto;\n" + 
    				"    max-width:498px\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    .footerContent {\n" + 
    				"    color:gray;\n" + 
    				"    font-family:Helvetica;\n" + 
    				"    font-size:10px;\n" + 
    				"    line-height:150%;\n" + 
    				"    padding-top:2em;\n" + 
    				"    padding-right:2em;\n" + 
    				"    padding-bottom:2em;\n" + 
    				"    padding-left:2em;\n" + 
    				"    text-align:left\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    /**\n" + 
    				"    * @tab Footer\n" + 
    				"    * @section footer link\n" + 
    				"    * @tip Set the styling for your email's footer links. Choose a color that helps them stand out from your text.\n" + 
    				"    */\n" + 
    				"    .footerContent a:link,.footerContent a:visited,/* Yahoo! Mail Override */ .footerContent a .yshortcuts,.footerContent a span /* Yahoo! Mail Override */ {\n" + 
    				"    color:#606060;\n" + 
    				"    font-weight:400;\n" + 
    				"    text-decoration:underline\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    /**\n" + 
    				"    * @tab Footer\n" + 
    				"    * @section footer link\n" + 
    				"    * @tip Set the styling for your email's footer links. Choose a color that helps them stand out from your text.\n" + 
    				"    */\n" + 
    				"    .bodyContentImageFull p {\n" + 
    				"    font-size:0!important;\n" + 
    				"    margin-bottom:0!important\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    .brdBottomPadd {\n" + 
    				"    border-bottom:1px solid #f0f0f0\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    .brdBottomPadd-two {\n" + 
    				"    border-bottom:1px solid #f0f0f0\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    .brdBottomPadd .bodyContent {\n" + 
    				"    padding-bottom:2.286em\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    .brdBottomPadd-two .bodyContent {\n" + 
    				"    padding-bottom:.857em\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    a.blue-btn {\n" + 
    				"      background: #5098ea;\n" + 
    				"      display: inline-block;\n" + 
    				"      color: #FFFFFF;\n" + 
    				"      border-top:10px solid #5098ea;\n" + 
    				"      border-bottom:10px solid #5098ea;\n" + 
    				"      border-left:20px solid #5098ea;\n" + 
    				"      border-right:20px solid #5098ea;\n" + 
    				"      text-decoration: none;\n" + 
    				"      font-size: 14px;\n" + 
    				"      margin-top: 1.0em;\n" + 
    				"      border-radius: 3px 3px 3px 3px;\n" + 
    				"      background-clip: padding-box;\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    .bodyContentTicks {\n" + 
    				"    color:#505050;\n" + 
    				"    font-family:Helvetica;\n" + 
    				"    font-size:14px;\n" + 
    				"    line-height:150%;\n" + 
    				"    padding-top:2.857em;\n" + 
    				"    padding-right:3.5em;\n" + 
    				"    padding-left:3.5em;\n" + 
    				"    padding-bottom:1.786em;\n" + 
    				"    text-align:left\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    .splitTicks {\n" + 
    				"    width:100%\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    .splitTicks--one {\n" + 
    				"    width:19%;\n" + 
    				"    color:#505050;\n" + 
    				"    font-family:Helvetica;\n" + 
    				"    font-size:14px;\n" + 
    				"    padding-bottom:1.143em\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    .splitTicks--two {\n" + 
    				"    width:5%\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    .splitTicks--three {\n" + 
    				"    width:71%;\n" + 
    				"    color:#505050;\n" + 
    				"    font-family:Helvetica;\n" + 
    				"    font-size:14px;\n" + 
    				"    padding-top:.714em\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    .splitTicks--three h3 {\n" + 
    				"    margin-bottom:.278em\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    .splitTicks--four {\n" + 
    				"    width:5%\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    @media only screen and (max-width: 550px),screen and (max-device-width: 550px) {\n" + 
    				"    body[yahoo] .hide {\n" + 
    				"    display:none!important\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    body[yahoo] .buttonwrapper {\n" + 
    				"    background-color:transparent!important\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    body[yahoo] .button {\n" + 
    				"    padding:0!important\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    body[yahoo] .button a {\n" + 
    				"    background-color:#e05443;\n" + 
    				"    padding:15px 15px 13px!important\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    body[yahoo] .unsubscribe {\n" + 
    				"    font-size:14px;\n" + 
    				"    display:block;\n" + 
    				"    margin-top:.714em;\n" + 
    				"    padding:10px 50px;\n" + 
    				"    background:#2f3942;\n" + 
    				"    border-radius:5px;\n" + 
    				"    text-decoration:none!important\n" + 
    				"    }\n" + 
    				"    }\n" + 
    				"\n" + 
    				"    @media only screen and (max-width: 480px),screen and (max-device-width: 480px) {\n" + 
    				"      .bodyContentTicks {\n" + 
    				"        padding:6% 5% 5% 6%!important\n" + 
    				"      }\n" + 
    				"\n" + 
    				"      .bodyContentTicks td {\n" + 
    				"        padding-top:0!important\n" + 
    				"      }\n" + 
    				"\n" + 
    				"      h1 {\n" + 
    				"        font-size:34px!important\n" + 
    				"      }\n" + 
    				"\n" + 
    				"      h2 {\n" + 
    				"        font-size:30px!important\n" + 
    				"      }\n" + 
    				"\n" + 
    				"      h3 {\n" + 
    				"        font-size:24px!important\n" + 
    				"      }\n" + 
    				"\n" + 
    				"      h4 {\n" + 
    				"        font-size:18px!important\n" + 
    				"      }\n" + 
    				"\n" + 
    				"      h5 {\n" + 
    				"        font-size:16px!important\n" + 
    				"      }\n" + 
    				"\n" + 
    				"      h6 {\n" + 
    				"        font-size:14px!important\n" + 
    				"      }\n" + 
    				"\n" + 
    				"      p {\n" + 
    				"        font-size:18px!important\n" + 
    				"      }\n" + 
    				"\n" + 
    				"      .brdBottomPadd .bodyContent {\n" + 
    				"        padding-bottom:2.286em!important\n" + 
    				"      }\n" + 
    				"\n" + 
    				"      .brdBottomPadd-two .bodyContent {\n" + 
    				"        padding-bottom:.857em!important\n" + 
    				"      }\n" + 
    				"\n" + 
    				"      #templateContainerMiddleBtm .bodyContent {\n" + 
    				"        padding:6% 5% 5% 6%!important\n" + 
    				"      }\n" + 
    				"\n" + 
    				"      .bodyContent {\n" + 
    				"        padding:6% 5% 1% 6%!important\n" + 
    				"      }\n" + 
    				"\n" + 
    				"      .bodyContent img {\n" + 
    				"        max-width:100%!important\n" + 
    				"      }\n" + 
    				"\n" + 
    				"      .bodyContentImage {\n" + 
    				"        padding:3% 6% 6%!important\n" + 
    				"      }\n" + 
    				"\n" + 
    				"      .bodyContentImage img {\n" + 
    				"        max-width:100%!important\n" + 
    				"      }\n" + 
    				"\n" + 
    				"      .bodyContentImage h4 {\n" + 
    				"        font-size:16px!important\n" + 
    				"      }\n" + 
    				"\n" + 
    				"      .bodyContentImage h5 {\n" + 
    				"        font-size:15px!important;\n" + 
    				"        margin-top:0\n" + 
    				"      }\n" + 
    				"    }\n" + 
    				"    .ii a[href] {color: inherit !important;}\n" + 
    				"    span > a, span > a[href] {color: inherit !important;}\n" + 
    				"    a > span, .ii a[href] > span {text-decoration: inherit !important;}\n" + 
    				"  </style>\n" + 
    				"\n" + 
    				"</body>\n" + 
    				"</html>\n" + 
    				"";
    	return "test verification email";
    }
}
