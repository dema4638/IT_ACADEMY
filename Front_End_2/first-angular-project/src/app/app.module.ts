import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomePageComponent } from './home-page/home-page.component';
import { PostComponent } from './home-page/post/post.component';
import { NavbarComponent } from './home-page/navbar/navbar.component';
import { SidebarComponent } from './home-page/sidebar/sidebar.component';

@NgModule({
  declarations: [
    AppComponent,
    HomePageComponent,
    PostComponent,
    NavbarComponent,
    SidebarComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
