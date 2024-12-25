## Explanation for queue

Say we have a restaurant. People start coming in and waiting in a queue. We want to make sure the first person that comes in is the first person served.

The best way we can do this, is by using a Queue. A queue will always return the first things added (FIFO, first-in first-out) to the queue.

## Terminology
- Front: person who was added to the line first
- Back: person who was added to the line last (we don't usually care about this)

### Visualization

Restuarant: John <- Mary <- Jane
John has come first, john should get served first. Jane should get served last.

It'll look a lot like this on the queue:
```
---
Jane
Mary
John <-- this is the front 
---
```
And we can just use the dequeue() method off the stack, and get "John". I now know what the first person here was.

## Methods

### Enqueue
Enqueue will add someone to the **end** of the line. Meaning they will be last served.

### Dequeue
Dequeue will remove the first person in line. Meaning the order in which people are served is oldest added first.
