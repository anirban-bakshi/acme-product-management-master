import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

import { IProduct } from '../product-list/product';

@Component({
  selector: 'app-product-detail',
  templateUrl: './product-detail.component.html',
  styleUrls: ['./product-detail.component.css']
})
export class ProductDetailComponent implements OnInit {

  pageTitle: string = 'Product Detail';
  product: IProduct;

  constructor(private activatedRoute: ActivatedRoute,
              private router: Router) { }

  ngOnInit() {
    //+ is a javascript short cut to convert string to number
    let id = +this.activatedRoute.snapshot.paramMap.get('id'); 
    this.pageTitle += ` ${id} `;
    this.product = {
      'productId': id,
      'productName': 'Leaf Rake',
      'productCode': 'GDN-0011',
      'releaseDate': 'March 19, 2019',
      'description': 'Leaf Rake with 48 inch wooden handle',
      'price': 19/95,
      'starRating': 3.2,
      'imageUrl': "./assets/images/leaf_rake.png"
    };
  }

  onBack(): void {
    this.router.navigate(['/products']);
  }

}
