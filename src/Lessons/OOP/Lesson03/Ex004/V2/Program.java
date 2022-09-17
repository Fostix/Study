package Lessons.OOP.Lesson03.Ex004.V2;


public class Program {
    public static void main(String[] args) {
        Repository<AudioContent> audioStorage = new Repository("audioStorage");
        audioStorage.add(new AudioContent("track_001.mp3"));
        audioStorage.add(new AudioContent("03 Дорожка 03.wma"));

        for (int index = 0; index < audioStorage.count(); index++) {
            System.out.println(audioStorage.get(index));
        }

        Repository<VideoContent> videoStorage = new Repository("videoStorage");
        videoStorage.add(new VideoContent("Новый фильм 1.wmv"));
        videoStorage.add(new VideoContent("Новый фильм 5.3gp"));

        for (int index = 0; index < videoStorage.count(); index++) {
            System.out.println(videoStorage.get(index));
        }

        //#region problem
        // audioStorage.add(new VideoContent("Приключение приключенцев.mp4"));
        // videoStorage.add(new AudioContent("Музыкальная музыка.wav"));
        //#endregion


//        //#region проблема решена
//        audioStorage.add(new VideoContent("Приключение приключенцев.mp4"));
//        videoStorage.add(new AudioContent("Музыкальная музыка.wav"));
//        //#endregion


        //#region оказывается НЕТ, решение V3
        Repository<String> stringRepository = new Repository<>("stringRepository");
        stringRepository.add("Привет");
        stringRepository.add("Как");
        stringRepository.add("Так");
        stringRepository.add("То");
        stringRepository.add("Пока");
        stringRepository.add("хах");
        for (int i = 0; i < stringRepository.count(); i++) {
            System.out.println(stringRepository.get(i));
        }
        //#endregion



//        Repository audioStorage = new Repository("audioStorage");
//        audioStorage.add(new AudioContent("track_001.mp3"));
//        audioStorage.add(new AudioContent("03 Дорожка 03.wav"));
//
//        for (int index = 0; index < audioStorage.count(); index++) {
//            System.out.println(audioStorage.get(index));
//        }
//
//        Repository videoStorage = new Repository("videoStorage");
//        videoStorage.add(new VideoContent("Новый фильм 1.wmv"));
//        videoStorage.add(new VideoContent("Новый фильм 5.3gp"));
//
//        for (int index = 0; index < videoStorage.count(); index++) {
//            System.out.println(videoStorage.get(index));
//        }
//
//        //#region problem
//        audioStorage.add(new VideoContent("Приключение приключенцев.mp4"));
//        videoStorage.add(new AudioContent("Музыкальная музыка.wav"));
//        //#endregion
    }
}
