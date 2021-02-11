<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>td_Ligne libre de type ProduitService Servi_b125ad</name>
   <tag></tag>
   <elementGuidId>0f415cf3-98a0-4813-a75d-e02e761692d1</elementGuidId>
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
      <name>class</name>
      <type>Main</type>
      <value>nobottom linecoldescription minwidth500imp</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>

		 Ligne libre de type  ProduitService Services prédéfinis en vente 

          
        	$(document).ready(function () {
        		$('#idprod').select2({
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

ref - lib - 1 Jour - 900 € HT
</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;tablelines&quot;)/tbody[1]/tr[@class=&quot;pair nodrag nodrop nohoverpair&quot;]/td[@class=&quot;nobottom linecoldescription minwidth500imp&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//table[@id='tablelines']/tbody/tr[2]/td</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Réduc.'])[1]/following::td[2]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Qté'])[1]/following::td[3]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//form/div/table/tbody/tr[2]/td</value>
   </webElementXpaths>
</WebElementEntity>
