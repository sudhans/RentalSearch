The Domain Module
This module is meant to hold complex business logics, filters, transformations and other data processing algorithms.

Pros:
- The business logic can be reused in other projects
Eg. desktop or other multi-platform apps

Cons:
- When most business logics are handled at server end, this module would be a overkill.
In those cases, it is better to avoid this layer and just use the presentation layer