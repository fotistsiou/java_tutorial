# Synchronous - Asynchronous - Parallel

When we are considering some complex process, let's call it **workflow**, various parts of it may run differently.
Sometimes actions go one by one, sometimes they go in random order overlapping each other, and sometimes things go
simultaneously and in parallel. The workflow can evolve differently. There are three sorts of workflow executions
sequence:**synchronous**, **asynchronous**, and **parallel**.

## Synchronous workflow

> One task at a time, the next starts when the current is done

Synchronous workflows are very common. Most of the activities should go synchronously if their goal is to achieve some
specific results. The number of examples is enormous. Scenes in a movie plot, car assembling, words in a sentence,
cooking, you name it.

## Asynchronous workflow

> Multiple tasks at the same time in overlapping periods, executed by little parts.

Operations of this kind often emerge when there is a need for waiting. Imagine you are reading on an aircraft while
flying, or you do the dishes while something is cooking; those pairs of activities are asynchronous.

## Parallel processing

> Multiple or one task split into parts, being executed continuously by different executors in parallel.

Parallel execution is possible only if there is more than one executor. Cashiers in a supermarket are an example of
parallel processing in everyday life, as well as highways.
