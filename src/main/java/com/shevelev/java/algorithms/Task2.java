package com.shevelev.java.algorithms;


/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class Task2 {

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int i = 0;
        int tmpSum;
        int carry = 0;

        ListNode result = null;
        ListNode intervalResult = null;

        while (l1 != null || l2 != null) {
            int l1Value = (l1 == null) ? 0 : l1.val;
            int l2Value = (l2 == null) ? 0 : l2.val;

            tmpSum = carry + l1Value + l2Value;

            int checkTen = tmpSum / 10;
            if (checkTen > 0) {
                carry = checkTen;
                tmpSum -= checkTen * 10;
            }

            if (i == 0) {
                result = new ListNode(tmpSum);
                intervalResult = result;
                i++;
            }else {
                intervalResult.next = new ListNode(tmpSum);
                intervalResult = intervalResult.next;
            }

            l1 = l1.next;
            l2 = l2.next;
        }

        return result;
    }

    public static void main(String[] args) {
        Task2 task2 = new Task2();
        ListNode l1 = new ListNode(2);
        ListNode listNode2 = new ListNode(4);
        ListNode listNode3 = new ListNode(3);
        ListNode l2 = new ListNode(5);
        ListNode listNode5 = new ListNode(6);
        ListNode listNode6 = new ListNode(4);

        l1.next = listNode2;
        listNode2.next = listNode3;

        l2.next = listNode5;
        listNode5.next = listNode6;

        ListNode result = task2.addTwoNumbers(l1, l2);
        System.out.println("sda");
    }
}

