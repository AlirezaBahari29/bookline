package com.example.bookline;

public class Book1Information extends Information{
    @Override
    public String getName() {
        return "پسر، موشکور، روباه و اسب";
    }

    @Override
    public String getInformation() {
        return "بدون شک برای همه شما داشتن کتابی فوق العاده با پیامهای فراموش نشدنی و نشاط آور، بسیار لذت بخش است. کتاب پسر، موش کور، روباه و اسب تمام این ویژگی های منحصر به فرد را داراست. چارلی مکس در این اثر پرفروش با روایت داستانی در رنگی است به شما دوستی، مهربانی، عزت نفس و نحوه لذت بردن از زندگی را یاد میدهند.";
    }

    @Override
    public int getRating() {
        return 3;
    }

    @Override
    public String getBestSentence() {
        return "درخواست کمک به معنی تسلیم شدن نیست";
    }
}
