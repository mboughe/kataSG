package kataSG;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// CREATION CLIENT
		CompteBancaire cb = new CompteBancaire();
		cb.CompteBancaire("ANDRIAMANAMPISOA", "Joel", 800);

		// GESTION DE L'HISTORIQUE
		List historique = new ArrayList<>();
		List transaction = new ArrayList();

		boolean a = true;

		// BOUCLE TANT QU'ON CHOISI UNE OPTION
		while (a) {
			Scanner choixOption = new Scanner(System.in);

			System.out.println("Quelle opération voulez vous effectuer ?");
			System.out
					.println("1 - Crediter\n2 - debiter\n3 - Afficher l'historique");

			int option = choixOption.nextInt();

			/* Use 1 --> CREDITER MON COMPTE */
			if (option == 1) {
				System.out
						.println("Quelle somme voulez vous déposer dans vorte compte ?");
				Scanner depot = new Scanner(System.in);

				double montant = depot.nextDouble();
				double newMontant = cb.crediterCompteBancaire(montant);

				// RECUPERATION DE LA DATE DE LA TRANSACTION
				String format = "dd/MM/yy H:mm:ss";
				java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat(
						format);
				java.util.Date date = new java.util.Date();

				/* AJOUT DE LA TRANSACTION DANS L'HISTORIQUE */
				transaction.add("Somme ajoutée");
				transaction.add(montant + " €");
				transaction.add(formater.format(date));
				transaction.add(newMontant + " €");

				historique.add(transaction);

				/* AFFICHAGE RESULTAT */
				System.out.println("Vous avez ajouté " + montant
						+ " € \n\nRécapitulatif du compte.\n");
				cb.afficher(formater.format(date));

				/* DEMANDE DE NOUVELLE OPERATION */
				System.out
						.println("\nVoulez vous effectuer une autre opération ? ");
				Scanner sc = new Scanner(System.in);
				System.out.println("1 - Oui\n2 - Non");

				int newOperation = sc.nextInt();
				if (newOperation == 1) {
					a = true;
				} else {
					a = false;
					System.out.println("AAUREVOIR !! , ET A BIENTOT CHEZ SOCIETE GENERAL  ");
				}
			}

			/* Use 2 --> DEBITER MON COMPTE */
			else if (option == 2) {
				System.out
						.println("Quelle somme voulez vous récupérer dans vorte compte ?");
				Scanner debit = new Scanner(System.in);

				double montant = debit.nextDouble();
				double newMontant = cb.debiterCompteBancaire(montant);

				String format = "dd/MM/yy H:mm:ss";
				java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat(
						format);
				java.util.Date date = new java.util.Date();

				/* AJOUT DE LA TRANSACTION DANS L'HISTORIQUE */
				transaction.add("Somme retirée");
				transaction.add(montant + " €");
				transaction.add(formater.format(date));
				transaction.add(newMontant + " €");

				historique.add(transaction);

				System.out.println(montant);
				System.out.println("Vous avez débité " + montant
						+ " € \n\nRécapitulatif du compte.\n");
				cb.afficher(formater.format(date));

				/* DEMANDE DE NOUVELLE OPERATION */
				System.out
						.println("\nVoulez vous effectuer une autre opération ? ");
				Scanner sc = new Scanner(System.in);
				System.out.println("1 - Oui\n2 - Non");

				int newOperation = sc.nextInt();
				// CONDITION POUR BOUCLER TANT QUE NOUVELLE OPERATION
				if (newOperation == 1) {
					a = true;
				} else {
					a = false;
					System.out
							.println("AUREVOIR !! , ET A BIENTOT CHEZ SOCIETE GENERAL  ");
				}
			}

			/* Use 3 --> HISTORIQUE DES OPERATIONS */
			else {

				System.out.println(historique.get(0));

				/* DEMANDE NOUVELLE OPERATION */
				System.out
						.println("\nVoulez vous effectuer une autre opération ? ");
				System.out.println("1 - Oui\n2 - Non");
				Scanner sc = new Scanner(System.in);

				int newOperation = sc.nextInt();
				if (newOperation == 1) {
					a = true;
				} else {
					a = false;
					System.out.println("AUREVOIR !! , ET A BIENTOT CHEZ SOCIETE GENERAL  ");
				}
			}

		}

	}

}
