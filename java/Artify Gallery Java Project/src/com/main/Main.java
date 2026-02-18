package com.main;

import com.Artwork.Artwork;
import com.Artist.Artist;
import com.Exhibition.Exhibition;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Lists to store objects for each module
		List<Artwork> artworks = new ArrayList<>();
		List<Artist> artists = new ArrayList<>();
		List<Exhibition> exhibitions = new ArrayList<>();
		
		
		// Infinite loop for menu until user chooses Exit
		while (true) {
			System.out.println("\n=== Artify Gallery Menu ===");
			System.out.println("1. Add Artwork");
			System.out.println("2. List Artworks");
			System.out.println("3. Update Artwork");
			System.out.println("4. Delete Artwork");
			System.out.println("5. Add Artist");
			System.out.println("6. List Artist");
			System.out.println("7. Update Artist");
			System.out.println("8. Delete Artist");
			System.out.println("9. Add Exhibition");
			System.out.println("10. List Exhibitions");
			System.out.println("11. Update Exhibition");
			System.out.println("12. Delete Exhibition");
			System.out.println("13. Exit");
			System.out.println("Choose option: ");
			
			int choice = sc.nextInt();
			sc.nextLine(); // consume nextLine
			
			switch (choice) {
			// -------------- Artwork Module --------------
			
			// Add Artwork
			case 1: 
				System.out.print("Enter Artwork Id: ");		
				int artId = sc.nextInt();
				sc.nextLine();
				System.out.print("Title: ");
				String title = sc.nextLine();
				System.out.print("Category: ");
				String category = sc.nextLine();
				System.out.print("Description: ");
				String description = sc.nextLine();
				artworks.add(new Artwork(artId, title, category, description));
				System.out.println("Artwork added!");
				break;
			
		    // List Artwork
			case 2:
				if(artworks.isEmpty())
					System.out.println("No artworks found");
				else artworks.forEach(System.out::println);
				break;
			
			// Update Artwork
			case 3: 
				System.out.println("Enter Artwork Id to update: ");
				int updateArtId = sc.nextInt();
				sc.nextLine();
				for (Artwork art : artworks) {
					if (art.id == updateArtId) {
						System.out.print("New Title: "); 
						art.title = sc.nextLine();
						System.out.print("New Category: "); 
						art.category = sc.nextLine();
						System.out.print("New Description: "); 
						art.description = sc.nextLine();
						System.out.print("Artwork updated!"); 
					}
					
				}
				break;
			
				// Delete Artwork
			case 4:
				System.out.print("Enter Artwork Id to delete: "); 
				int delArtId = sc.nextInt();
				artworks.removeIf(a -> a.id == delArtId);
				System.out.print("Artwork deleted if it existed"); 
				break;
				
			// -------------- Artist Module --------------
				
				// Add Artist
			case 5:
				System.out.print("Enter Artist Id: ");
				int artistId = sc.nextInt();
				sc.nextLine();
				System.out.print("Artist Name: ");
				String name = sc.nextLine();
				System.out.print("Bio: ");
				String bio = sc.nextLine();
				artists.add(new Artist(artistId, name, bio));
				System.out.println("Artist added!");
				break;
				
				// List Artists
			case 6: 
				if (artists.isEmpty())
					System.out.println("No artists found");
				else artists.forEach(System.out::println);
				break;
				
				// Update Artist
			case 7:
				System.out.print("Enter Artist Id to update: ");
				int updateArtistId = sc.nextInt();
				sc.nextLine();
				for (Artist artist : artists) {
					if (artist.id == updateArtistId) {
						System.out.print("New Name: ");
						artist.name = sc.nextLine();
						System.out.print("New Bio: ");
						artist.bio = sc.nextLine();
						System.out.println("Artist updated!");
					}
				}
				break;
				
				// Delete Artist
			case 8:
				System.out.print("Enter Artist Id to delete: ");
				int delArtistId = sc.nextInt();
				artists.removeIf(a -> a.id == delArtistId);
				System.out.println("Artist deleted if it existed");
				break;
				
				// -------------- Exhibition Module --------------
			case 9: 
				System.out.print("Enter Exhibition Id: ");
				int exId = sc.nextInt();
				sc.nextLine();
				System.out.print("Exhibition Name: ");
				String exName = sc.nextLine();
				System.out.print("Theme: ");
				String theme = sc.nextLine();
				System.out.print("Date: ");
				String date = sc.nextLine();
				exhibitions.add(new Exhibition(exId, exName, theme, date));
				System.out.println("Exhibition added!");
				break;
				
				// List Exhibitions
			case 10:
				System.out.print("enter Exhibition Id: ");
				int ExId = sc.nextInt();
				sc.nextLine();
				System.out.print("Exhibition Name: ");
				String ExName = sc.nextLine();
				System.out.print("Theme: ");
				String Theme = sc.nextLine();
				System.out.print("Date: ");
				String Date = sc.nextLine();
				exhibitions.add(new Exhibition(ExId, ExName, Theme, Date));
				System.out.println("Exhibition added!");
				break;
				
				// Update Exhibition
			case 11:
				System.out.print("Enter Exhibition ID to update: ");
				int updateExId = sc.nextInt();
				sc.nextLine();
				for (Exhibition ex : exhibitions) {
					if (ex.id == updateExId) {
						System.out.print("New Name: ");
						ex.name = sc.nextLine();
						System.out.print("New Theme: ");
						ex.theme = sc.nextLine();
						System.out.print("New Date: ");
						ex.date = sc.nextLine();
						System.out.println("Exhibition updated!");
					}
				}
				break;
				
				// Delete Exhibition
			case 12:
				System.out.print("Enter Exhibition Id to delete: ");
				int delExId = sc.nextInt();
				exhibitions.removeIf(e -> e.id == delExId);
				System.out.println("Exhibition deleted if it existed");
				break;
				
				// -------------- Exit --------------
			case 13:
				System.out.println("Exiting Artify Gallery...");
				sc.close();
				return;
				
			default:
				System.out.println("Invalid choice!");
					
			}
		}
	}

}
