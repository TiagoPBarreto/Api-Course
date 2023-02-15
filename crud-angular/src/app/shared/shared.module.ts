import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { AppMaterialModule } from './app-material/app-material.module';
import { ComfirmationDialogComponent } from './components/comfirmation-dialog/comfirmation-dialog.component';
import { ErrorDialogComponent } from './components/error-dialog/error-dialog.component';
import { CategoryPipe } from './pipe/category.pipe';

@NgModule({
  declarations: [
    ErrorDialogComponent,
    CategoryPipe,
    ComfirmationDialogComponent
  ],

  imports: [CommonModule, AppMaterialModule],

  exports: [ErrorDialogComponent, CategoryPipe, ComfirmationDialogComponent],
})
export class SharedModule {}
