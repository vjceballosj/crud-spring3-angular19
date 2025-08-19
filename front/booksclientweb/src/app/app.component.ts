import { Component, OnInit } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { AppService } from './service/app.service';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet],
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
        this.tareas = tareas;
      })
  }
}
