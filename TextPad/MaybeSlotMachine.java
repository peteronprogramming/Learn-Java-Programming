import static java.lang.Math.*;

public class MaybeSlotMachine
{
   public static void main(String[] args)
   {
	   int slot1 = (int) round(random() * 100);
	   int slot2 = (int) round(random() * 100);
	   int slot3 = (int) round(random() * 100);
	   int slot4 = (int) round(random() * 100);
	   int slot5 = (int) round(random() * 100);

	   String slot1R, slot2R, slot3R, slot4R, slot5R;

	   if (slot1 < 20) slot1R = "Kakek Biru"; else if (slot1 < 40) slot1R = "Koin Hijau";
	   else if (slot1 < 60) slot1R = "Koin Emas"; else if (slot1 < 80) slot1R = "Giok Emas";
	   else slot1R = "Kakek Merah";

	   if (slot2 < 20) slot2R = "Kakek Biru"; else if (slot2 < 40) slot2R = "Koin Hijau";
	   else if (slot2 < 60) slot2R = "Koin Emas"; else if (slot2 < 80) slot2R = "Giok Emas";
	   else slot2R = "Kakek Merah";

	   if (slot3 < 20) slot3R = "Kakek Biru"; else if (slot3 < 40) slot3R = "Koin Hijau";
	   else if (slot3 < 60) slot3R = "Koin Emas"; else if (slot3 < 80) slot3R = "Giok Emas";
	   else slot3R = "Kakek Merah";

	   if (slot4 < 20) slot4R = "Kakek Biru"; else if (slot4 < 40) slot4R = "Koin Hijau";
	   else if (slot4 < 60) slot4R = "Koin Emas"; else if (slot4 < 80) slot4R = "Giok Emas";
	   else slot4R = "Kakek Merah";

	   if (slot5 < 20) slot5R = "Kakek Biru"; else if (slot5 < 40) slot5R = "Koin Hijau";
	   else if (slot5 < 60) slot5R = "Koin Emas"; else if (slot5 < 80) slot5R = "Giok Emas";
	   else slot5R = "Kakek Merah";

	   System.out.println(slot1R + " , " + slot2R + " , " + slot3R + " , " + slot4R + " , " + slot5R); 
   }
}
