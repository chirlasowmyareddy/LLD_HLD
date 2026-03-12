package LLD_HLD.HighLevelDesign.DesignSnakesAndLadders;

import java.util.concurrent.ThreadLocalRandom;

public class Board {

    Cell[][] cells;

    public Board(int size,int noOfSnakes,int noOfLadders){
        initializeCells(size);
        addSnakesAndLadders(cells,noOfSnakes,noOfLadders);
    }

    public void initializeCells(int size){
        cells = new Cell[size][size];

        for(int i = 0 ; i <size ;i++){
            for(int j = 0 ; j< size; j++){
                Cell cellObj = new Cell();
                cells[i][j] = cellObj;
            }
        }
    }

    private void addSnakesAndLadders(Cell[][] cells,int noOfSnakes,int noOfLadders){
        while(noOfSnakes > 0){
            int snakeHead = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
            if(snakeTail>snakeHead){
                continue;
            }

            Jump snakeObj = new Jump();
            snakeObj.start = snakeHead;
            snakeObj.end = snakeTail;

            Cell cell = getCell(snakeHead);
            cell.jump = snakeObj;

            noOfSnakes--;
        }

        while(noOfLadders > 0){
            int ladderStart = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
            int ladderEnd = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
            if(ladderEnd<=ladderStart){
                continue;
            }

            Jump ladderObj = new Jump();
            ladderObj.start = ladderStart;
            ladderObj.end = ladderEnd;

            Cell cell = getCell(ladderStart);
            cell.jump = ladderObj;

            noOfLadders--;
        }


    }


    public Cell getCell(int playerPosition){
        int bRow =  playerPosition/cells.length;
        int bCol = (playerPosition%cells.length);

        return cells[bRow][bCol];
    }
    
}
