<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>td_AK - AlaskaAL - AlabamaAR - ArkansasAZ -_907c87</name>
   <tag></tag>
   <elementGuidId>8a43f1a7-0cd9-45b0-9e0d-ec228d855df8</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>td</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>colspan</name>
      <type>Main</type>
      <value>3</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>maxwidthonsmartphone</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value> AK - AlaskaAL - AlabamaAR - ArkansasAZ - ArizonaCA - CaliforniaCO - ColoradoCT - ConnecticutDE - DelawareFL - FloridaGA - GeorgiaHI - HawaiiIA - IowaID - IdahoIL - IllinoisIN - IndianaKS - KansasKY - KentuckyLA - LouisianaMA - MassachusettsMD - MarylandME - MaineMI - MichiganMN - MinnesotaMO - MissouriMS - MississippiMT - MontanaNC - North CarolinaND - North DakotaNE - NebraskaNH - New HampshireNJ - New JerseyNM - New MexicoNV - NevadaNY - New YorkOH - OhioOK - OklahomaOR - OregonPA - PennsylvaniaRI - Rhode IslandSC - South CarolinaSD - South DakotaTN - TennesseeTX - TexasUT - UtahVA - VirginiaVT - VermontWA - WashingtonWI - WisconsinWV - West VirginiaWY - Wyoming  

          
        	$(document).ready(function () {
        		$('#state_id').select2({
        		    dir: 'ltr',
        			width: 'resolve',		/* off or resolve */
					minimumInputLength: 0,
					language: select2arrayoflanguage,
    				containerCssClass: ':all:',					/* Line to add class of origin SELECT propagated to the new &lt;span class=&quot;select2-selection...> tag */
					templateResult: function (data, container) {	/* Format visible output into combo list */
	 					/* Code to add class of origin OPTION propagated to the new select2 &lt;li> tag */
						if (data.element) { $(container).addClass($(data.element).attr(&quot;class&quot;)); }
					    //console.log(data.html);
						if ($(data.element).attr(&quot;data-html&quot;) != undefined) return htmlEntityDecodeJs($(data.element).attr(&quot;data-html&quot;));		// If property html set, we decode html entities and use this
					    return data.text;
					},
					templateSelection: function (selection) {		/* Format visible output of selected value */
						return selection.text;
					},
					escapeMarkup: function(markup) {
						return markup;
					},
					dropdownCssClass: 'ui-dialog'
				});
});

</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;id-right&quot;)/div[@class=&quot;fiche&quot;]/form[1]/div[@class=&quot;tabBar tabBarWithBottom&quot;]/table[@class=&quot;border centpercent&quot;]/tbody[1]/tr[8]/td[@class=&quot;maxwidthonsmartphone&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//div[@id='id-right']/div/form/div/table/tbody/tr[8]/td[2]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Département / Canton'])[1]/following::td[1]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Etats-Unis (US)'])[2]/following::td[2]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Téléphone'])[1]/preceding::td[1]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Fax'])[1]/preceding::td[3]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//tr[8]/td[2]</value>
   </webElementXpaths>
</WebElementEntity>
