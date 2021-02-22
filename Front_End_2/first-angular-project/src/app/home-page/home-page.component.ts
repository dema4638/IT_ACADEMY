import { Component, OnInit } from '@angular/core';
import { Post } from 'src/app/types';

@Component({
  selector: 'app-home-page',
  templateUrl: './home-page.component.html',
  styleUrls: ['./home-page.component.css'],
})
export class HomePageComponent implements OnInit {
  currentPost = 'hello';
  posts: Post[];

  constructor() {
    this.posts = [];
  }

  ngOnInit(): void {
    this.posts = [
      {
        header: 'Post #1',
        text:
          'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Scelerisque viverra mauris in aliquam sem.',
        image:
          'https://i1.wp.com/statisticsbyjim.com/wp-content/uploads/2019/05/vitamins.jpg?w=640&ssl=1',
      },
      {
        header: 'Post #2',
        text:
          'Eget duis at tellus at urna condimentum. Etiam sit amet nisl purus in. Ac turpis egestas sed tempus urna et pharetra. Vivamus at augue eget arcu dictum varius duis at. Donec adipiscing tristique risus nec.',
        image:
          'https://i0.wp.com/statisticsbyjim.com/wp-content/uploads/2018/01/coin_toss.png?w=500&ssl=1',
      },
      {
        header: 'Post #3',
        text:
          'Integer enim neque volutpat ac tincidunt vitae. Molestie ac feugiat sed lectus vestibulum mattis ullamcorper. Ornare aenean euismod elementum nisi quis eleifend.',
        image:
          'https://i1.wp.com/statisticsbyjim.com/wp-content/uploads/2019/05/random_dice.png?fit=600%2C471&ssl=1',
      },
    ];
  }
}
