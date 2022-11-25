#include <stdio.h>

typedef struct Node {
  int val;
  struct Node *next;
} myNode;

myNode *addNode();
myNode *addNodeBack();
void display(myNode *head);
void findVal(int val, myNode *head);
void insertMiddle(int n, myNode * head, myNode * newNode);
void removeMiddle(int n, myNode * head);

int main() {
  myNode *HEAD = NULL;
  HEAD = addNodeBack();
  //display(HEAD);
  //findVal(10, HEAD);
  myNode * newNode =(myNode *)malloc(sizeof(myNode));
  newNode->val=4;
  newNode->next=NULL;
  //insertMiddle(9, HEAD, newNode);
  removeMiddle(3,HEAD);
}

myNode *addNode() {
  myNode *temp = NULL;
  myNode *head = NULL;
  for (int i = 1; i < 5; i++) {
    temp = (myNode *)malloc(sizeof(myNode));
    temp->val = i;
    temp->next = NULL;
    if (head == NULL) {
      head = temp;
    } else {
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
  for (int i = 1; i < 9; i++) {
    temp = (myNode *)malloc(sizeof(myNode));
    temp->val = i;
    temp->next = NULL;
    if (head == NULL) {
      head = temp;
    } else if (head->next == NULL) {
      head->next = temp;
    } else {
      p = head;
      while (p->next != NULL) {
        p = p->next;
      }
      p->next = temp;
    }
  }
  return head;
}

void display(myNode *head) {
  myNode *p = head;
  while (p) {
    printf("%d", p->val);
    p = p->next;
  }
}

void findNth(int n, myNode *head) {
  myNode *p = NULL;
  p = head;
  int i = 0;
  while (i < n) {
    p = p->next;
  }
}

void findVal(int val, myNode *head) {
  myNode *p = NULL;
  p = head;
  int i = 0;
  int found = 0;
  while (p != NULL){
      if (val == p->val){
        printf("\n已找到，id为：%d.",p->val);
        found = 1;
        }
      p = p->next;
      i++;
    }
    if (found == 0){
      printf("\ncannot find the value");
    }
}

void insertMiddle(int n, myNode * head, myNode * newNode){
  myNode *p = NULL;
  p = head;
  int i = 0;
  while (i!=n-1){
    if(p->next == NULL){
      printf("sorry,cannot insert");
      return;
    }
    p = p->next;
    i++;
  }
  newNode->next = p->next;
  p->next = newNode;
  display(head);
}

void removeMiddle(int n, myNode * head){
  myNode *p = NULL;
  p = head;
  int i = 0;
  while (i!=n-1){
    if(p->next == NULL){
      printf("sorry,cannot remove");
      return;
    }
    p = p->next;
    i++;
  }
  p->next = p->next->next;
  display(head);
}
