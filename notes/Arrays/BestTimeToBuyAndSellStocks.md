# Best Time to Buy and Sell Stock — Easy
Problem Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
Pattern Tag: array / greedy / sliding-window

## SRS Tracking
- Stage: 1
- Review Date: 2026-05-31
- Last Rating: -
- Review Count: 0
- Graduated: No

---

# Real World Analogy
You're watching a stock ticker all month. You want to find the single best day to have bought (cheapest) and the single best later day to sell (most profit). You keep updating "cheapest so far" as you scan forward.

## Core Insight
Track `minPrice` as you scan left to right. At each index, either you found a new minimum (update it) or you check if selling today beats your best profit so far. One pass is enough.

## Approach
Initialize `minPrice = MAX_VALUE`, `maxProfit = 0`. For each price: if it's less than `minPrice`, update `minPrice`. Otherwise, check `price - minPrice` against `maxProfit`.

## Mental Model
```
┌──────────────────────────────────────┬───────────────────────────────────────┐
│ Decision                             │ Why                                   │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ One pass, not nested loops           │ Brute O(n²) causes TLE on large inputs│
├──────────────────────────────────────┼───────────────────────────────────────┤
│ Update minPrice before profit check  │ Can't sell on the same day you buy    │
├──────────────────────────────────────┼───────────────────────────────────────┤
│ Return 0 if no profit possible       │ maxProfit starts at 0, handles        │
│                                      │ strictly decreasing arrays            │
└──────────────────────────────────────┴───────────────────────────────────────┘
```

## Pseudocode
```
minPrice = MAX_VALUE
maxProfit = 0

for price in prices:
    if price < minPrice:
        minPrice = price
    else:
        maxProfit = max(maxProfit, price - minPrice)

return maxProfit
```

## Complexity
- Time: O(n) — single pass
- Space: O(1) — only two variables

## Watch Out For
- If prices are strictly decreasing, profit is 0 (maxProfit initialized to 0 handles this)
- You must buy before you sell — scanning left to right guarantees this

## Dry Run
```
prices = [7, 1, 5, 3, 6, 4]

i=0: price=7 < MAX → minPrice=7
i=1: price=1 < 7   → minPrice=1
i=2: price=5 > 1   → profit=4, maxProfit=4
i=3: price=3 > 1   → profit=2, maxProfit=4
i=4: price=6 > 1   → profit=5, maxProfit=5
i=5: price=4 > 1   → profit=3, maxProfit=5

return 5 ✓
```

## Boilerplate Template
```java
public int maxProfit(int[] prices) {
    int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;
    for (int price : prices) {
        if (price < minPrice) {
            minPrice = price;
        } else {
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
    }
    return maxProfit;
}
```
