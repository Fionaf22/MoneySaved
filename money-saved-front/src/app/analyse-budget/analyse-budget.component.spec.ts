import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AnalyseBudgetComponent } from './analyse-budget.component';

describe('AnalyseBudgetComponent', () => {
  let component: AnalyseBudgetComponent;
  let fixture: ComponentFixture<AnalyseBudgetComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AnalyseBudgetComponent]
    });
    fixture = TestBed.createComponent(AnalyseBudgetComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
