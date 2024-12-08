# Groovy's `each` vs. `collect`

This example demonstrates a common misunderstanding in Groovy regarding the difference between the `each` and `collect` methods when working with collections.

The `each` method iterates over each element, performing an action on it. However, `each` itself returns `null`.  The `collect` method, on the other hand, transforms each element and returns a new collection containing the transformed elements.

**Problem:**  Unexpected `null` return when using `each` to transform a collection

**Solution:** Use `collect` to transform a collection and return a new collection.