$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/add_to_cart.feature");
formatter.feature({
  "name": "Add to Cart",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@featuretag"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Scenario two",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on the store page",
  "keyword": "Given "
});
formatter.step({
  "name": "I add a \"\u003cproduct_name\u003e\" to the cart",
  "keyword": "When "
});
formatter.step({
  "name": "I see 1 \"\u003cproduct_name\u003e\" in the cart",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "product_name"
      ]
    },
    {
      "cells": [
        "Blue Shoes"
      ]
    }
  ],
  "tags": [
    {
      "name": "@prod"
    }
  ]
});
formatter.scenario({
  "name": "Scenario two",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@featuretag"
    },
    {
      "name": "@prod"
    }
  ]
});
formatter.step({
  "name": "I am on the store page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.AddToCart.i_am_on_the_store_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add a \"Blue Shoes\" to the cart",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.AddToCart.i_add_a_to_the_cart(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see 1 \"Blue Shoes\" in the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.AddToCart.i_see_in_the_cart(java.lang.Integer,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});