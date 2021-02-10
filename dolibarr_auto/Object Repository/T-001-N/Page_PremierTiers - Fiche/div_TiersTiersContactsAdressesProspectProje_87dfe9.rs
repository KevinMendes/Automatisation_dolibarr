<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_TiersTiersContactsAdressesProspectProje_87dfe9</name>
   <tag></tag>
   <elementGuidId>4e8c368a-7c50-45ee-933e-0e8aa2c1911e</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>fiche</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>


 TiersTiers
Contacts/Adresses
Prospect
Projets
Objets référents
Information de paiement
Notes
Fichiers joints
Événements







jQuery(document).ready(function() {
            $(function() {
            	$( &quot;#dialog-confirm-action-delete&quot; ).dialog(
            	{
                    autoOpen: false,
						open: function() {
            				$(this).parent().find(&quot;button.ui-button:eq(2)&quot;).focus();
						},
                    resizable: false,
                    height: &quot;220&quot;,
                    width: &quot;500&quot;,
                    modal: true,
                    closeOnEscape: false,
                    buttons: {
                        &quot;Oui&quot;: function() {
                        	var options = &quot;&amp;token=%242y%2410%24MUdy2XvGlffl2TxKZBHMru8P80Qp6uaM1ea144a4KyAC7ufOapD1W&quot;;
                        	var inputok = [];	/* List of fields into form */
                         	var pageyes = &quot;/dolibarr/societe/card.php?socid=3&amp;action=confirm_delete&amp;confirm=yes&quot;;
                         	if (inputok.length>0) {
                         		$.each(inputok, function(i, inputname) {
                         			var more = &quot;&quot;;
									var inputvalue;
                         			if ($(&quot;input[name='&quot; + inputname + &quot;']&quot;).attr(&quot;type&quot;) == &quot;radio&quot;) {
										inputvalue = $(&quot;input[name='&quot; + inputname + &quot;']&quot;).val();
									} else {
                         		    	if ($(&quot;#&quot; + inputname).attr(&quot;type&quot;) == &quot;checkbox&quot;) { more = &quot;:checked&quot;; }
                         				inputvalue = $(&quot;#&quot; + inputname + more).val();
									}
                         			if (typeof inputvalue == &quot;undefined&quot;) { inputvalue=&quot;&quot;; }
									console.log(&quot;check inputname=&quot;+inputname+&quot; inputvalue=&quot;+inputvalue);
                         			options += &quot;&amp;&quot; + inputname + &quot;=&quot; + encodeURIComponent(inputvalue);
                         		});
                         	}
                         	var urljump = pageyes + (pageyes.indexOf(&quot;?&quot;) &lt; 0 ? &quot;?&quot; : &quot;&quot;) + options;
            				if (pageyes.length > 0) { location.href = urljump; }
                            $(this).dialog(&quot;close&quot;);
                        },
                        &quot;Non&quot;: function() {
                        	var options = &quot;&amp;token=%242y%2410%24MUdy2XvGlffl2TxKZBHMru8P80Qp6uaM1ea144a4KyAC7ufOapD1W&quot;;
                         	var inputko = [];	/* List of fields into form */
                         	var pageno=&quot;&quot;;
                         	if (inputko.length>0) {
                         		$.each(inputko, function(i, inputname) {
                         			var more = &quot;&quot;;
                         			if ($(&quot;#&quot; + inputname).attr(&quot;type&quot;) == &quot;checkbox&quot;) { more = &quot;:checked&quot;; }
                         			var inputvalue = $(&quot;#&quot; + inputname + more).val();
                         			if (typeof inputvalue == &quot;undefined&quot;) { inputvalue=&quot;&quot;; }
                         			options += &quot;&amp;&quot; + inputname + &quot;=&quot; + encodeURIComponent(inputvalue);
                         		});
                         	}
                         	var urljump=pageno + (pageno.indexOf(&quot;?&quot;) &lt; 0 ? &quot;?&quot; : &quot;&quot;) + options;
                         	//alert(urljump);
            				if (pageno.length > 0) { location.href = urljump; }
                            $(this).dialog(&quot;close&quot;);
                        }
                    }
                }
                );

            	var button = &quot;action-delete&quot;;
            	if (button.length > 0) {
                	$( &quot;#&quot; + button ).click(function() {
                		$(&quot;#dialog-confirm-action-delete&quot;).dialog(&quot;open&quot;);
        			});
                }
            });
            });
            
Retour listeOuvertPremierTiers
 Etats-Unis
Prospect / ClientProspectCode clientCU2102-00003Prof Id (FEIN)Numéro de TVA Type du tiers EffectifsType d'entité légaleCapital 

Maison mère CommerciauxAucun commercial particulier affecté


Envoyer emailModifier
FusionnerSupprimer




Fichiers joints
Fichiers 
Aucun







Les 10 derniers événements liés
Réf.ParTypeTitreDate
Aucun

</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;id-right&quot;)/div[@class=&quot;fiche&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//div[@id='id-right']/div</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Autre'])[1]/following::div[5]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Clients'])[1]/following::div[6]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[3]/div[2]/div</value>
   </webElementXpaths>
</WebElementEntity>
