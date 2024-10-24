package racingcar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


public class Application {
    public static void main(String[] args) throws IOException {
        // TODO: 프로그램 구현
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Random rand = new Random();
        String separator = "[,]+";
        int trynum = 0;



        System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)");

        String inputcarnames = br.readLine();
        String[] carnames = inputcarnames.split(separator);
        //System.out.println("입력받은 차 이름들 " + inputcarnames);
        //for (String carname : carnames) {System.out.println("배열) car name: " + carname);}

        // 이름이 5자 이하인지 확인
        for (String carname : carnames) {
            if (carname.length() > 5) {
                throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다.");
            }
        }

        System.out.println("시도할 횟수는 몇 회인가요?");
        trynum = Integer.parseInt(br.readLine());
        //System.out.println(trynum);

        System.out.println("\n실행 결과");

        for (int i = 0; i < trynum; i++) {
            int forwardmovement = 0;
            for (String carname : carnames) {
                if (rand.nextInt(10) >= 4) {
                    forwardmovement++;
                }
                System.out.println(carname + " : " + forwardmovement);
            }
            System.out.println();

        }

        System.out.println("최종 우승자: ");

    }
}

