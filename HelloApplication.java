package com.example.inclassactivity1;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class HelloApplication extends Application {

        @Override
        public void start(Stage primaryStage) throws IOException {

                primaryStage.setTitle("BH Cosmetics");
                // main borderpane that is used
                BorderPane TopBorderPane = new BorderPane();
                // top mini banner
                Rectangle PinkRectangle = new Rectangle(1300, 50, Color.web("#fde4e6"));
                Label pinkText = new Label("CYBER SAVINGS! UP TO 50% OFF EVERYTHING + FREE GIFT WHEN YOU SPEND $60+");
                StackPane PinkBanner = new StackPane(PinkRectangle, pinkText);
                // images for the bottom of each page
                ImageView bottom = new ImageView("file:./res/BOTTOM.png");
                bottom.setFitWidth(1300);
                bottom.setPreserveRatio(true);
                ImageView bottom2 = new ImageView("file:./res/BOTTOM.png");
                bottom2.setFitWidth(1300);
                bottom2.setPreserveRatio(true);
                ImageView bottom3 = new ImageView("file:./res/BOTTOM.png");
                bottom3.setFitWidth(1300);
                bottom3.setPreserveRatio(true);

                // top menubar
                MenuBar menuBar = new MenuBar();

                ImageView logo = new ImageView("file:./res/Logo.png");
                logo.setPreserveRatio(true);
                logo.setFitHeight(45);

                ImageView search = new ImageView("file:./res/search.png");
                search.setPreserveRatio(true);
                search.setFitHeight(25);
                Button searchButton = new Button();
                searchButton.setGraphic(search);

                Label amountOfItems = new Label("0");
                Label cost = new Label("$0.00");

                Menu NewIn = new Menu("New In");

                Menu Eyes = new Menu("Eyes");
                MenuItem Eyeshadow = new MenuItem("Eyeshadow");
                MenuItem FalseLashes = new MenuItem("False Lashes");
                MenuItem Eyeliner = new MenuItem("Eyeliner");
                MenuItem EyeGlitter = new MenuItem("Eye Glitter");
                MenuItem Brows = new MenuItem("Brows");
                // eyeliner page
                Label homeEyesEyeliner = new Label("Home | Eyes | Eyeliner");
                homeEyesEyeliner.setStyle("-fx-font-size: 22.4px");
                homeEyesEyeliner.setPadding(new Insets(15, 20, 20, 20));

                ImageView eyelinerHeader = new ImageView("file:./res/eyelinerheader.jpg");

                // Directly get the Screen width
                double screenWidth = Screen.getPrimary().getVisualBounds().getWidth();

                // Set the width of the ImageView to the screen width and preserve the aspect
                // ratio
                eyelinerHeader.setFitWidth(screenWidth);
                eyelinerHeader.setPreserveRatio(true);

                Label showFilter = new Label("Show Filter");
                showFilter.setStyle("-fx-font-size: 22.4px;-fx-underline: true;");

                Label showBestSellers = new Label("Best Sellers");
                showBestSellers.setStyle("-fx-font-size: 22.4px;-fx-underline: true;");

                // Creating a ContextMenu for best sellers options
                ContextMenu bestSellersMenu = new ContextMenu();
                bestSellersMenu.getItems().addAll(
                                new MenuItem("Best Sellers"),
                                new MenuItem("Top Rated"),
                                new MenuItem("New Arrivals"));

                // Set action for each menu item
                bestSellersMenu.getItems().forEach(menuItem -> menuItem.setOnAction(event -> {
                        // Handle the selected option here
                        System.out.println("Selected: " + menuItem.getText());
                }));

                // Set the ContextMenu to the label
                showBestSellers.setOnMouseClicked(
                                event -> bestSellersMenu.show(showBestSellers, event.getScreenX(), event.getScreenY()));

                // Adding a gap between showFilter and showBestSellers
                HBox filterSortBox = new HBox(15, showFilter, showBestSellers);
                filterSortBox.setPadding(new Insets(10, 2, 10, 20));

                // Insert images with adjusted sizes
                double imageWidth = 300;

                ImageView eyeliner1_imageView1 = new ImageView("file:./res/1.png");
                ImageView eyeliner2_imageView2 = new ImageView("file:./res/2.png");
                ImageView eyeliner3_imageView3 = new ImageView("file:./res/3.png");
                ImageView eyeliner4_imageView4 = new ImageView("file:./res/4.png");
                eyeliner1_imageView1.setFitWidth(imageWidth);
                eyeliner1_imageView1.setPreserveRatio(true);
                eyeliner2_imageView2.setFitWidth(imageWidth);
                eyeliner2_imageView2.setPreserveRatio(true);
                eyeliner3_imageView3.setFitWidth(imageWidth);
                eyeliner3_imageView3.setPreserveRatio(true);
                eyeliner4_imageView4.setFitWidth(imageWidth);
                eyeliner4_imageView4.setPreserveRatio(true);

                ImageView eyeliner_bottom_page_imageView = new ImageView("file:./res/Bottom_liner_page.png");
                eyeliner_bottom_page_imageView.setFitWidth(1300);
                eyeliner_bottom_page_imageView.setPreserveRatio(true);

                // individual product page
                Label directory = new Label("Home | Eyes | Eyeliner");

                Image image1Image = new Image("file:./res/item1.png");
                ImageView image1Large = new ImageView(image1Image);
                image1Large.setPreserveRatio(true);
                image1Large.setFitHeight(500);
                HBox image1LargeHbox = new HBox(image1Large);
                image1LargeHbox.setAlignment(Pos.CENTER);

                ImageView image1 = new ImageView(image1Image);
                image1.setPreserveRatio(true);
                image1.setFitHeight(70);
                HBox image1HBox = new HBox(image1);
                Button image1Button = new Button();
                image1Button.setGraphic(image1HBox);
                image1Button.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent e) {
                                image1Large.setImage(image1Image);
                        }
                });

                Image image2Image = new Image("file:./res/item2.png");
                ImageView image2 = new ImageView(image2Image);
                image2.setPreserveRatio(true);
                image2.setFitHeight(70);
                HBox image2HBox = new HBox(image2);
                Button image2Button = new Button();
                image2Button.setGraphic(image2HBox);
                image2Button.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent e) {
                                image1Large.setImage(image2Image);
                        }
                });

                Image image3Image = new Image("file:./res/item3.png");
                ImageView image3 = new ImageView(image3Image);
                image3.setPreserveRatio(true);
                image3.setFitHeight(70);
                HBox image3HBox = new HBox(image3);
                Button image3Button = new Button();
                image3Button.setGraphic(image3HBox);
                image3Button.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent e) {
                                image1Large.setImage(image3Image);
                        }
                });

                Image image4Image = new Image("file:./res/item4.png");
                ImageView image4 = new ImageView(image4Image);
                image4.setPreserveRatio(true);
                image4.setFitHeight(70);
                HBox image4HBox = new HBox(image4);
                Button image4Button = new Button();
                image4Button.setGraphic(image4HBox);
                image4Button.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent e) {
                                image1Large.setImage(image4Image);
                        }
                });

                HBox seletionImageHBox = new HBox(10, image1Button, image2Button, image3Button, image4Button);
                seletionImageHBox.setAlignment(Pos.CENTER);

                String expandedPRODUCTOVERVIEW = new String(
                                "Pick and play! Get ready to serve power-packed looks in " +
                                                "\npowerful pigment in our Colour Play – Gel Eyeliner! " +
                                                "\nCreated with jojoba oil and vitamin E, this thin-tipped" +
                                                "\nliner is both hydrating and soft, making it the go-to for" +
                                                "\neffortless, no-limit eye looks that last. The high-impact," +
                                                "\nno budge, smudge-resistant formula glides on smoothly for" +
                                                "\nseamless application in the waterline.\n"
                                                + //
                                                "Available in 4 versatile shades:​\n" + //
                                                "   • Black​\n" + //
                                                "   • White​\n" + //
                                                "   • Navy Blue\n" + //
                                                "   • Brown​\n" + //
                                                "Vegan. Cruelty-Free. Clean Ingredients\n" + //
                                                "");

                TreeItem<String> PRODUCTOVERVIEW = new TreeItem<String>("PRODUCT OVERVIEW");
                PRODUCTOVERVIEW.setExpanded(false);
                PRODUCTOVERVIEW.getChildren().addAll(
                                new TreeItem<String>(expandedPRODUCTOVERVIEW));

                String expandedDIRECTIONS = new String(
                                "Application: Sweep onto the waterline or onto the lids as\n desired.");

                TreeItem<String> DIRECTIONS = new TreeItem<String>("DIRECTIONS");
                DIRECTIONS.setExpanded(false);
                DIRECTIONS.getChildren().addAll(
                                new TreeItem<String>(expandedDIRECTIONS));

                String expandedINGREDIENTS = new String(
                                "Dimethicone, Candelilla Cera (Euphorbia Cerifera (Candelilla)" +
                                                "\nWax/Cire De Candelilla), Cera Microcristallina" +
                                                "\n(Microcrystalline Wax/Cire Microcristalline), C13-15 Alkane," +
                                                "\nTrimethylsiloxysilicate, Synthetic Beeswax, Silica, Helianthus" +
                                                "\n Annuus (Sunflower) Seed Oil, Disteardimonium Hectorite," +
                                                "\nHydroxide, Phenoxyethanol, Alcohol, Simmondsia Chinensis " +
                                                "\nOil, Tocopheryl Acetate, Anthemis Nobilis Flower Extract," +
                                                "\nBht, Ci 77891 (Titanium Dioxide). ");

                TreeItem<String> INGREDIENTS = new TreeItem<String>("INGREDIENTS");
                INGREDIENTS.setExpanded(false);
                INGREDIENTS.getChildren().addAll(
                                new TreeItem<String>(expandedINGREDIENTS));

                String expandedPRODUCTDETAILS = new String("Range:   Bh Los Angeles Colour Play Gel Eyeliner\n" +
                                "Brand:   BH Cosmetics");

                TreeItem<String> PRODUCTDETAILS = new TreeItem<String>("PRODUCT DETAILS");
                PRODUCTDETAILS.setExpanded(false);
                PRODUCTDETAILS.getChildren().addAll(
                                new TreeItem<String>(expandedPRODUCTDETAILS));

                TreeItem<String> DESCRIPTION = new TreeItem<String>("DESCRIPTION");
                DESCRIPTION.setExpanded(false);
                DESCRIPTION.getChildren().addAll(PRODUCTOVERVIEW, DIRECTIONS, INGREDIENTS, PRODUCTDETAILS);

                TreeView<String> treeView = new TreeView<String>(DESCRIPTION);
                ImageView reviews = new ImageView("file:./res/reviews.png");
                reviews.setPreserveRatio(true);
                reviews.setFitWidth(520);

                VBox directoryVBox = new VBox(directory);
                directoryVBox.setAlignment(Pos.CENTER_LEFT);
                VBox itemLeft = new VBox(26.5, directoryVBox, image1LargeHbox, seletionImageHBox, reviews);
                itemLeft.setAlignment(Pos.CENTER);

                Label ItemName = new Label("COLOUR PLAY GEL EYELINER");
                Label Reward = new Label("EARN 4 REWARD POINTS WHEN PURCHASING THIS PRODUCT");
                ImageView rating = new ImageView("file:./res/rating.png");
                rating.setPreserveRatio(true);
                rating.setFitHeight(30);
                Label price = new Label("$3.50");
                Label savings = new Label("YOU SAVE: $1.50");
                Label rrp = new Label("RRP $5.00");
                Label colortext = new Label("BLACK");

                ImageView black = new ImageView("file:./res/black.png");
                black.setPreserveRatio(true);
                black.setFitHeight(50);
                Button blackButton = new Button();
                blackButton.setGraphic(black);
                blackButton.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent e) {
                                image1Large.setImage(image1Image);
                                image1.setImage(image1Image);
                                image2.setImage(image2Image);
                                image3.setImage(image3Image);
                                image4.setImage(image4Image);
                                colortext.setText("BLACK");
                        }
                });

                Image brownImage1 = new Image("file:./res/brownimage1.png");
                Image brownImage2 = new Image("file:./res/brownimage2.png");
                Image brownImage3 = new Image("file:./res/brownimage3.png");
                Image brownImage4 = new Image("file:./res/brownimage4.png");
                ImageView brown = new ImageView("file:./res/brown.png");
                brown.setPreserveRatio(true);
                brown.setFitHeight(50);
                Button brownButton = new Button();
                brownButton.setGraphic(brown);
                brownButton.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent e) {
                                image1Large.setImage(brownImage1);
                                image1.setImage(brownImage1);
                                image2.setImage(brownImage2);
                                image3.setImage(brownImage3);
                                image4.setImage(brownImage4);
                                colortext.setText("BROWN");
                        }
                });

                Image blueImage1 = new Image("file:./res/blueimage1.png");
                Image blueImage2 = new Image("file:./res/blueimage2.png");
                Image blueImage3 = new Image("file:./res/blueimage3.png");
                Image blueImage4 = new Image("file:./res/blueimage4.png");
                ImageView blue = new ImageView("file:./res/blue.png");
                blue.setPreserveRatio(true);
                blue.setFitHeight(50);
                Button blueButton = new Button();
                blueButton.setGraphic(blue);
                blueButton.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent e) {
                                image1Large.setImage(blueImage1);
                                image1.setImage(blueImage1);
                                image2.setImage(blueImage2);
                                image3.setImage(blueImage3);
                                image4.setImage(blueImage4);
                                colortext.setText("BLUE");
                        }
                });

                Image whiteImage1 = new Image("file:./res/whiteimage1.png");
                Image whiteImage2 = new Image("file:./res/whiteimage2.png");
                Image whiteImage3 = new Image("file:./res/whiteimage3.png");
                Image whiteImage4 = new Image("file:./res/whiteimage4.png");
                ImageView white = new ImageView("file:./res/white.png");
                white.setPreserveRatio(true);
                white.setFitHeight(50);
                Button whiteButton = new Button();
                whiteButton.setGraphic(white);
                whiteButton.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent e) {
                                image1Large.setImage(whiteImage1);
                                image1.setImage(whiteImage1);
                                image2.setImage(whiteImage2);
                                image3.setImage(whiteImage3);
                                image4.setImage(whiteImage4);
                                colortext.setText("WHITE");
                        }
                });

                HBox colorsHBox = new HBox(10, blackButton, brownButton, blueButton, whiteButton);
                GridPane quantityinstockGridPane = new GridPane();
                Label instockLabel = new Label("IN STOCK");

                ImageView subtract = new ImageView("file:./res/subtract.png");
                subtract.setPreserveRatio(true);
                subtract.setFitHeight(50);
                Label quantity = new Label("0");
                ImageView plus = new ImageView("file:./res/plus.png");
                plus.setPreserveRatio(true);
                plus.setFitHeight(50);
                Button subtractbutton = new Button();
                subtractbutton.setGraphic(subtract);
                subtractbutton.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent e) {
                                int quantityValue = Math.round(Integer.parseInt(quantity.getText()));
                                if (quantityValue > 0) {
                                        quantityValue--;
                                        quantity.setText(quantityValue + "");
                                }
                        }
                });
                Button plusbutton = new Button();
                plusbutton.setGraphic(plus);
                plusbutton.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent e) {
                                int quantityValue = Math.round(Integer.parseInt(quantity.getText()));
                                quantityValue++;
                                quantity.setText(quantityValue + "");
                        }
                });
                ImageView addtobag = new ImageView("file:./res/addtobag.png");
                addtobag.setPreserveRatio(true);
                addtobag.setFitHeight(50);
                Button addtobagbutton = new Button();
                addtobagbutton.setGraphic(addtobag);
                addtobagbutton.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent e) {
                                double total = Integer.parseInt(quantity.getText()) * 3.50;
                                cost.setText("$" + total + "0");
                                amountOfItems.setText(Integer.parseInt(quantity.getText()) + "");
                        }
                });

                HBox addsubtract = new HBox(10, subtractbutton, quantity, plusbutton);
                addsubtract.setAlignment(Pos.CENTER_LEFT);
                Label Wishlist = new Label("SAVE TO WISHLIST");
                ImageView heart = new ImageView("file:./res/heart.png");
                ImageView redheart = new ImageView("file:./res/redheart.png");
                heart.setPreserveRatio(true);
                heart.setFitHeight(30);
                redheart.setPreserveRatio(true);
                redheart.setFitHeight(30);
                Button heartbutton = new Button();
                heartbutton.setGraphic(heart);
                heartbutton.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent e) {
                                heartbutton.setGraphic(redheart);
                        }
                });

                HBox saveto = new HBox(5, heartbutton, Wishlist);
                saveto.setAlignment(Pos.CENTER_LEFT);

                quantityinstockGridPane.add(rating, 0, 0);
                quantityinstockGridPane.add(price, 0, 1);
                quantityinstockGridPane.add(savings, 0, 2);
                quantityinstockGridPane.add(rrp, 0, 3);
                quantityinstockGridPane.add(colorsHBox, 0, 4);
                quantityinstockGridPane.add(colortext, 0, 5);
                quantityinstockGridPane.add(instockLabel, 1, 5);
                quantityinstockGridPane.add(addsubtract, 0, 6);
                quantityinstockGridPane.add(addtobagbutton, 1, 6);
                quantityinstockGridPane.add(saveto, 0, 7);
                quantityinstockGridPane.setHgap(50);
                quantityinstockGridPane.setVgap(15);

                VBox itemRight = new VBox(ItemName, Reward, quantityinstockGridPane, treeView);
                itemRight.setPadding(new Insets(42, 1, 1, 1));

                HBox itemPage = new HBox(60, itemLeft, itemRight);

                itemPage.setPadding(new Insets(15, 10, 10, 10));
                itemPage.setAlignment(Pos.CENTER);

                VBox itemPageParent = new VBox(itemPage, bottom2);
                itemPageParent.setAlignment(Pos.CENTER);

                Button clickeyeliner = new Button();
                clickeyeliner.setGraphic(eyeliner1_imageView1);
                clickeyeliner.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent e) {
                                TopBorderPane.setCenter(itemPageParent);
                        }
                });
                // eyeliner page cont
                HBox eyeliner_images_hbox = new HBox();
                eyeliner_images_hbox.getChildren().addAll(clickeyeliner, eyeliner2_imageView2,
                                eyeliner3_imageView3, eyeliner4_imageView4);
                eyeliner_images_hbox.setSpacing(20); // Customize the gap between images
                eyeliner_images_hbox.setPadding(new Insets(10));
                eyeliner_images_hbox.setAlignment(Pos.CENTER);

                // Combine all elements
                VBox eyelinerPageVBox = new VBox();
                VBox homeEyesEyelinerbox = new VBox(homeEyesEyeliner);
                homeEyesEyelinerbox.setAlignment(Pos.CENTER_LEFT);
                eyelinerPageVBox.getChildren().addAll(homeEyesEyelinerbox, eyelinerHeader, filterSortBox,
                                eyeliner_images_hbox, eyeliner_bottom_page_imageView);
                eyelinerPageVBox.setAlignment(Pos.CENTER);

                // Set the background color of the root node
                eyelinerPageVBox.setBackground(
                                new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

                Eyes.getItems().addAll(Eyeshadow, Eyeliner, EyeGlitter, Brows, FalseLashes);
                Eyeliner.setOnAction(event -> {
                        TopBorderPane.setCenter(eyelinerPageVBox);
                });
                // top menubar cont
                Menu BrushesandTools = new Menu("Brushes & Tools");
                MenuItem BrushSets = new MenuItem("Brush Sets");
                MenuItem SingleBrushes = new MenuItem("Single Brushes");
                MenuItem MakeupBags = new MenuItem("Makeup Bags");
                BrushesandTools.getItems().addAll(BrushSets, SingleBrushes, MakeupBags);

                Menu Face = new Menu("Face");
                MenuItem Foundation = new MenuItem("Foundation");
                MenuItem Concealer = new MenuItem("Concealer");
                Face.getItems().addAll(Foundation, Concealer);

                Menu Lips = new Menu("Lips");
                MenuItem LipGloss = new MenuItem("Lip Gloss");
                MenuItem LiquidLipstick = new MenuItem("Liquid Lipstick");
                Lips.getItems().addAll(LipGloss, LiquidLipstick);

                Menu Cheeks = new Menu("Cheeks");
                MenuItem Blush = new MenuItem("Blush");
                MenuItem Highlight = new MenuItem("Highlight");
                MenuItem Bronzer = new MenuItem("Bronzer");
                MenuItem Contour = new MenuItem("Contour");
                Cheeks.getItems().addAll(Blush, Highlight, Bronzer, Contour);

                menuBar.getMenus().addAll(NewIn, Face, Lips, Cheeks, Eyes,
                                BrushesandTools);
                // homepage banner
                Rectangle grayRectangle = new Rectangle(1300, 50, Color.web("#f2f2f1"));
                ImageView banner = new ImageView("file:./res/banner.png");
                banner.setPreserveRatio(true);
                banner.setFitHeight(40);
                StackPane GrayBanner = new StackPane(grayRectangle, banner);

                Label CYBERMONDAYISHERE = new Label("CYBER MONDAY IS HERE");
                Label UPTO = new Label("UP TO");
                Label OFF = new Label("50% OFF");
                Label EVERYTHING = new Label("EVERYTHING");
                Label PLUS = new Label("PLUS FREE GIFT WHEN YOU SPEND $60+");
                VBox TextVBox = new VBox(-5, CYBERMONDAYISHERE, UPTO, OFF, EVERYTHING, PLUS);
                TextVBox.setAlignment(Pos.CENTER);
                Rectangle PinkOrnamentRectangle = new Rectangle(650, 210, Color.web("#fde4e6"));
                Rectangle DarkPinkOrnamentRectangle = new Rectangle(660, 220, Color.web("#b84c65"));
                ImageView ornament = new ImageView("file:./res/ornaments.png");
                ornament.setFitHeight(270);
                ornament.setFitWidth(1300);
                StackPane OrnamentBanner = new StackPane(ornament, DarkPinkOrnamentRectangle, PinkOrnamentRectangle,
                                TextVBox);

                HBox menuHBox = new HBox(20, logo, menuBar, searchButton, amountOfItems, cost);
                menuHBox.setAlignment(Pos.CENTER);
                // shoppingcart page
                // product picture vbox
                Image productImage = new Image("file:./res/CS2450pic8.png");
                ImageView pv = new ImageView(productImage);
                pv.setFitHeight(200);
                pv.setFitWidth(200);
                VBox productVBOX = new VBox(50, pv);

                // product text
                Label productL = new Label("COLOUR PLAY GEL EYELINER");
                Label descriptionL = new Label("IN STOCK");
                Label wishlistL = new Label("SAVE TO WISHLIST");

                ImageView heart2 = new ImageView("file:./res/heart.png");
                ImageView redheart2 = new ImageView("file:./res/redheart.png");
                heart2.setPreserveRatio(true);
                heart2.setFitHeight(20);
                redheart2.setPreserveRatio(true);
                redheart2.setFitHeight(20);
                Button heartbutton2 = new Button();
                heartbutton2.setGraphic(heart2);
                heartbutton2.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent e) {
                                heartbutton2.setGraphic(redheart2);
                        }
                });

                HBox wishListheart = new HBox(1, wishlistL, heartbutton2);
                wishListheart.setAlignment(Pos.CENTER_LEFT);
                // label vbox
                VBox descriptionVBOX = new VBox(50, productL, descriptionL, wishListheart);

                // price & price vbox
                Label priceL = new Label("$3.50");
                VBox priceVBOX = new VBox(50, priceL);

                // subtotal & vbox
                Label subtotalL = new Label("$3.50");
                Double subtotalEyelinerD = 3.50;
                VBox subtotalVBOX = new VBox(50, subtotalL);

                // buttons: add & subtract, label: quantity
                Label quantity2 = new Label("1");

                // cart total
                Label points = new Label("COMPLETE YOUR ORDER TO EARN POINTS");
                Label cartTOTAL = new Label(
                                "                                                     CART SUBTOTAL");
                Label total = new Label();
                Double totalTOTAL = subtotalEyelinerD;
                total.setText("$" + totalTOTAL + "0");

                Button add = new Button("+");
                add.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent actionEvent) {
                                int quantityValue = Math.round(Integer.parseInt(quantity2.getText()));
                                quantityValue++;
                                quantity2.setText(quantityValue + "");
                                subtotalL.setText("$" + quantityValue * 3.5 + "0");
                                total.setText("$" + quantityValue * 3.5 + "0");
                        }
                });

                Button subtract2 = new Button("-");
                subtract2.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent actionEvent) {
                                int quantityValue = Math.round(Integer.parseInt(quantity2.getText()));
                                if (quantityValue > 0) {

                                        quantityValue--;
                                        quantity2.setText(quantityValue + "");
                                        subtotalL.setText("$" + quantityValue * 3.5 + "0");
                                        total.setText("$" + quantityValue * 3.5 + "0");
                                }
                        }
                });

                // button hbox
                HBox buttonHBOX = new HBox(20, subtract2, quantity2, add);

                // gridpane: product, label, price, quantity
                GridPane productGP = new GridPane();
                productGP.setHgap(30);
                productGP.add(productVBOX, 0, 0);
                productGP.add(descriptionVBOX, 1, 0);
                productGP.add(priceVBOX, 6, 0);
                productGP.add(buttonHBOX, 9, 0);
                productGP.add(subtotalVBOX, 12, 0);

                // product hbox: gridpane
                HBox productHBOX = new HBox(50, productGP);
                productHBOX.setPadding(new Insets(40));

                // coupon textfield & hbox
                TextField couponTF = new TextField();
                couponTF.setPromptText("COUPON CODE");

                ImageView applyImage = new ImageView("file:./res/apply.png");
                applyImage.setPreserveRatio(true);
                applyImage.setFitHeight(30);
                Button couponB = new Button();
                couponB.setGraphic(applyImage);
                couponB.setOnAction(actionEvent -> {
                        String couponCODE = couponTF.getText();
                        if (couponCODE.equals("BEYONCE")) {
                                double quantityValue = Math.round(Double.parseDouble(quantity2.getText()));
                                total.setText("$" + quantityValue * 1.75 + "0");
                                couponTF.setPromptText("COUPON APPLIED");
                        }
                });

                // continue & checkout
                ImageView checkout = new ImageView("file:./res/checkout.png");
                checkout.setPreserveRatio(true);
                checkout.setFitHeight(50);
                Button checkoutB = new Button();
                checkoutB.setGraphic(checkout);

                ImageView continueImage = new ImageView("file:./res/continue.png");
                continueImage.setPreserveRatio(true);
                continueImage.setFitHeight(50);
                Button continueB = new Button();
                continueB.setGraphic(continueImage);

                ImageView line = new ImageView("file:./res/line.png");
                line.setPreserveRatio(true);
                ImageView line2 = new ImageView("file:./res/line.png");
                line2.setPreserveRatio(true);

                // hbox & vbox containers: cart total & coupon
                HBox totalHBOX = new HBox(50, points, cartTOTAL, total);
                HBox couponHBOX = new HBox(50, couponTF, couponB);
                HBox contcheckHBOX = new HBox(50, continueB, checkoutB);
                VBox innerVBox = new VBox(totalHBOX, line2);
                innerVBox.setAlignment(Pos.CENTER);
                VBox totalCouponVBOX = new VBox(50, innerVBox, couponHBOX, contcheckHBOX);
                totalCouponVBOX.setPadding(new Insets(0, 0, 30, 0));

                ImageView topShoppingCart = new ImageView("file:./res/topShoppingCart.png");
                topShoppingCart.setPreserveRatio(true);

                VBox shoppingCart = new VBox(topShoppingCart, productHBOX, line, totalCouponVBOX, bottom);
                shoppingCart.setAlignment(Pos.CENTER);
                totalCouponVBOX.setAlignment(Pos.CENTER);
                totalHBOX.setAlignment(Pos.CENTER);
                couponHBOX.setAlignment(Pos.CENTER);
                contcheckHBOX.setAlignment(Pos.CENTER);

                searchButton.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent e) {
                                TopBorderPane.setCenter(shoppingCart);
                        }
                });

                VBox TopVBox = new VBox(PinkBanner, menuHBox, GrayBanner);
                // Homepage cont
                Label bestseller = new Label("         BESTSELLERS");
                bestseller.setStyle("-fx-font-family: 'Canva Sans'; -fx-font-size: 38.3; -fx-font-weight: bold;");
                Label shop_all = new Label("Shop All");
                shop_all.setStyle("-fx-font-size: 20.4");
                shop_all.setPadding(new Insets(15, 20, 20, 20));
                HBox hBox1 = new HBox();
                hBox1.getChildren().addAll(bestseller, shop_all);
                hBox1.setSpacing(10);
                hBox1.setPadding(new Insets(20));

                ImageView imageView1 = new ImageView("file:./res/Products1.jpg");
                ImageView imageView2 = new ImageView("file:./res/Products2.jpg");
                ImageView imageView3 = new ImageView("file:./res/Products3.jpg");
                ImageView imageView4 = new ImageView("file:./res/Products4.jpg");
                double maxWidth1 = 250;
                imageView1.setFitWidth(maxWidth1);
                imageView1.setFitHeight(maxWidth1);
                imageView2.setFitWidth(maxWidth1);
                imageView2.setFitHeight(maxWidth1);
                imageView3.setFitWidth(maxWidth1);
                imageView3.setFitHeight(maxWidth1);
                imageView4.setFitWidth(maxWidth1);
                imageView4.setFitHeight(maxWidth1);

                Label description_image1 = new Label("\nColour Play Gel Eyeliner\n$3.50");
                Label description_image2 = new Label("\nColour Play Eyeshadow\n$10.00");
                Label description_image3 = new Label("\nColour Play Eyebrow Pencil\n$5.00");
                Label description_image4 = new Label("\nColour Play Gel Blush\n$6.00");

                VBox vBox2 = new VBox();
                VBox vBox3 = new VBox();
                VBox vBox4 = new VBox();
                VBox vBox5 = new VBox();
                double fixedVBoxHeight = 100; // Set a fixed height for each VBox
                vBox2.setMinHeight(fixedVBoxHeight);
                vBox3.setMinHeight(fixedVBoxHeight);
                vBox4.setMinHeight(fixedVBoxHeight);
                vBox5.setMinHeight(fixedVBoxHeight);
                vBox2.getChildren().addAll(imageView1, description_image1);
                vBox3.getChildren().addAll(imageView2, description_image2);
                vBox4.getChildren().addAll(imageView3, description_image3);
                vBox5.getChildren().addAll(imageView4, description_image4);

                HBox hBox2 = new HBox();
                hBox2.getChildren().addAll(vBox2, vBox3, vBox4, vBox5);
                hBox2.setSpacing(20);
                hBox2.setAlignment(Pos.CENTER);

                // Shop category section
                Label category = new Label("      BY CATEGORY");
                category.setStyle("-fx-font-family: 'Canva Sans'; -fx-font-size: 38.3; -fx-font-weight: bold;");
                Label shop_all2 = new Label("Shop All");
                shop_all2.setStyle("-fx-font-size: 20.4");
                shop_all2.setPadding(new Insets(15, 20, 20, 20));
                HBox hBox_category1 = new HBox();
                hBox_category1.getChildren().addAll(category, shop_all2);
                hBox_category1.setSpacing(10);
                hBox_category1.setPadding(new Insets(20));

                ImageView imageView_face = new ImageView("file:./res/category1.jpeg");
                ImageView imageView_lips = new ImageView("file:./res/category2.jpeg");
                ImageView imageView_cheeks = new ImageView("file:./res/category3.jpeg");
                ImageView imageView_eyes = new ImageView("file:./res/category4.jpeg");
                ImageView imageView_brushes = new ImageView("file:./res/category5.jpeg");

                Label label_face = new Label("\nFace\n");
                Label label_lips = new Label("\nLips\n");
                Label label_cheeks = new Label("\nCheeks\n");
                Label label_eyes = new Label("\nEyes\n");
                Label label_brushes = new Label("\nBrushes\n");

                label_face.setStyle("-fx-font-size: 17; -fx-font-weight: bold;");
                label_lips.setStyle("-fx-font-size: 17; -fx-font-weight: bold");
                label_cheeks.setStyle("-fx-font-size: 17; -fx-font-weight: bold");
                label_eyes.setStyle("-fx-font-size: 17; -fx-font-weight: bold");
                label_brushes.setStyle("-fx-font-size: 17; -fx-font-weight: bold");

                double maxWidth = 200;
                double maxHeight = 200;
                imageView_face.setFitWidth(maxWidth);
                imageView_face.setFitHeight(maxHeight);
                imageView_lips.setFitWidth(maxWidth);
                imageView_lips.setFitHeight(maxHeight);
                imageView_cheeks.setFitWidth(maxWidth);
                imageView_cheeks.setFitHeight(maxHeight);
                imageView_eyes.setFitWidth(maxWidth);
                imageView_eyes.setFitHeight(maxHeight);
                imageView_brushes.setFitWidth(maxWidth);
                imageView_brushes.setFitHeight(maxHeight);

                VBox vBox_face = new VBox();
                VBox vBox_lips = new VBox();
                VBox vBox_cheeks = new VBox();
                VBox vBox_eyes = new VBox();
                VBox vBox_brushes = new VBox();

                vBox_face.getChildren().addAll(imageView_face, label_face);
                vBox_lips.getChildren().addAll(imageView_lips, label_lips);
                vBox_cheeks.getChildren().addAll(imageView_cheeks, label_cheeks);
                vBox_eyes.getChildren().addAll(imageView_eyes, label_eyes);
                vBox_brushes.getChildren().addAll(imageView_brushes, label_brushes);

                vBox_face.setAlignment(Pos.CENTER);
                vBox_lips.setAlignment(Pos.CENTER);
                vBox_cheeks.setAlignment(Pos.CENTER);
                vBox_eyes.setAlignment(Pos.CENTER);
                vBox_brushes.setAlignment(Pos.CENTER);

                HBox hBox_category = new HBox();
                hBox_category.getChildren().addAll(vBox_face, vBox_lips, vBox_cheeks, vBox_eyes, vBox_brushes);
                hBox_category.setSpacing(40);
                hBox_category.setAlignment(Pos.CENTER);

                VBox shop_category_vBox = new VBox();
                shop_category_vBox.getChildren().addAll(hBox_category1, hBox_category);

                VBox home = new VBox(OrnamentBanner, hBox1, hBox2, shop_category_vBox, bottom3);

                TopBorderPane.setTop(TopVBox);
                TopBorderPane.setCenter(home);
                ScrollPane scrollPane = new ScrollPane();
                scrollPane.setContent(TopBorderPane);

                Scene myScene = new Scene(scrollPane, 1300, 500);
                myScene.getStylesheets().add(getClass().getResource("mystyles.css").toExternalForm());
                amountOfItems.setId("costtext");
                cost.setId("costtext");
                pinkText.setId("cybertext");
                CYBERMONDAYISHERE.setId("cyberMondaytext");
                UPTO.setId("uptext");
                OFF.setId("Everythingtext");
                EVERYTHING.setId("Everythingtext");
                PLUS.setId("plustext");
                image1LargeHbox.setId("imageborder");
                image1HBox.setId("smallerimageborder");
                image2HBox.setId("smallerimageborder");
                image3HBox.setId("smallerimageborder");
                image4HBox.setId("smallerimageborder");
                ItemName.setId("Itemtext");
                Reward.setId("Rewardstext");
                price.setId("priceText");
                savings.setId("savingstext");
                rrp.setId("rrptext");
                quantity.setId("rrptext");
                instockLabel.setId("rrptext");
                colortext.setId("rrptext");
                Wishlist.setId("rrptext");
                directory.setId("rrptext");
                heartbutton.setId("heartbutton");
                heartbutton2.setId("heartbutton");
                subtractbutton.setId("whitebutton");
                plusbutton.setId("whitebutton");
                addtobagbutton.setId("whitebutton");
                checkoutB.setId("whitebutton");
                continueB.setId("whitebutton");
                couponB.setId("whitebutton");
                blackButton.setId("circlebutton");
                brownButton.setId("circlebutton");
                blueButton.setId("circlebutton");
                whiteButton.setId("circlebutton");
                searchButton.setId("circlebutton");
                productL.setId("shoppingcarttext");
                descriptionL.setId("wishlistText");
                wishlistL.setId("wishlistText");
                subtract2.setId("rrptext");
                quantity2.setId("rrptext");
                add.setId("rrptext");
                priceL.setId("rrptext");
                subtotalL.setId("rrptext");
                couponTF.setId("rrptext");
                points.setId("rrptext");
                cartTOTAL.setId("rrptext");
                total.setId("rrptext");
                description_image1.setId("bestseller");
                description_image2.setId("bestseller");
                description_image3.setId("bestseller");
                description_image4.setId("bestseller");
                clickeyeliner.setId("circlebutton");

                primaryStage.setScene(myScene);
                primaryStage.show();
        }

        public static void main(String[] args) {
                launch();
        }
}
