## Explanation for stack

Say we have the trace tool. We want to keep track of every change someone makes to their trace, and allow them to use the undo button to undo the last change they made.

The best way we can do this, is by using a Stack. A stack will always return the last thing added (FILO, first-in last-out) to the stack.

## Terminology
- Top: the last thing added to the stack

### Visualization

Create stack frame -> Create variable -> Name variable -> Cross out variable

It'll look a lot like this on the stack:
```
---
Cross out variable <-- this is the top
Name variable
Create variable
Create stack frame
---
```

And we can just use the pop() method off the stack, and get "Cross out variable". I now know what the last thing created was.

### Methods
> This should remind you of array methods you've seenin the past.

### Push
This will add whatever item to the top of the stack, meaning it will be taken first.

### Pop
This will take whatever was added last off the stack and give it to you.

### Peek 
This will behave the same as pop, but not actually take the person off the stack. It's a good way to just look at who's on top without taking them off. Good for iteration.
