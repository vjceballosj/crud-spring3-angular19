import { Component, OnInit } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { AppService } from './service/app.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, CommonModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent implements OnInit {
  
  tareas?: any[];

  constructor(
    private appService: AppService
  ){}

  ngOnInit(): void {
      this.appService.listar()
      .subscribe((tareas: any) => {
        console.table('tareas', tareas)
        this.tareas = tareas;
      })
  }
}
