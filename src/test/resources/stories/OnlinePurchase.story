Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: verify that summer dresses can be added to the cart and it’s possible to proceed to the Sign in section.
Meta:
@onlinePurchase
Given I am on retail site
When I add <Summer> dresses to the cart
And I press <proceedToCheckout> button
Then <SignIn> page should be displayed successfully