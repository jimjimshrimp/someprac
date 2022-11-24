#include <stdio.h>

typedef struct Node {
  int val;
  struct Node *next;
} myNode;

myNode *addNode();
myNode *addNodeBack();
void display(myNode *head);

int main() {
  myNode *HEAD = NULL;
  HEAD = addNodeBack();
  display(HEAD);
}

myNode *addNode() {
  myNode *temp = NULL;
  myNode *head = NULL;
  for (int i = 1; i < 5; i++) {
    temp = (myNode *)malloc(sizeof(myNode));
    temp->val = i;
    temp->next = NULL;
    if (head == NULL) {  //if head is empty, then make temp the head.
      head = temp;
    } else {  //otherwise, temp points to previous head and becomes the new head.
      temp->next = head;
      head = temp;
    }
  }
  return head;
}

myNode *addNodeBack() {
  myNode *temp = NULL;
  myNode *head = NULL;
  myNode *p = NULL;
  for (int i = 1; i < 6; i++) {
    temp = (myNode *)malloc(sizeof(myNode));
    temp->val = i;
    temp->next = NULL;
    if (head == NULL) {  // if head is empty, then make temp the head.
      head = temp;
    } else if (head->next == NULL) { // else if head points to NULL, then add temp to head.
      head->next = temp;
    } else {  // else if head points to another node, make a pointer p to traverse through the linkedlist
      p = head;
      while (p->next != NULL) {
        p = p->next;
      }
      p->next = temp;  // find the node that points to null and add temp behind it.
    }
  }
  return head;
}

void display(myNode *head) {
  myNode *p = head;  // make a new head pointer to traverse through the linkedlist that needs to be displayed.
  while (p) {
    printf("%d", p->val);
    p = p->next;
  }
}
