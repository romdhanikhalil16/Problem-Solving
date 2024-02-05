#include <stdlib.h>
#include <stdio.h>

struct Node
{
    int data;
    struct Node *next;
};

// Function to insert a node at the begin of the linked list.;
struct Node *insertAtBegining(struct Node *head, int x)
{

    struct Node *newNode = malloc(sizeof(struct Node));
    newNode->data = x;
    newNode->next = head;
    return newNode;
}

// Function to insert a node at the end of the linked list.
struct Node *insertAtEnd(struct Node *head, int x)
{

    struct Node *newNode = malloc(sizeof(struct Node));
    newNode->data = x;
    newNode->next = NULL;

    if (head == NULL)
        return newNode;

    struct Node *tail = head;
    while (tail != NULL)
    {
        tail = tail->next;
    }

    tail->next = newNode;

    return head;
}