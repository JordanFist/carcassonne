package carcassonne.core.tiles;

import carcassonne.core.Tile;
import carcassonne.core.Node;
import carcassonne.core.Direction;
import carcassonne.core.Position;

//13. city connected W to N (3)

public class PlainCity extends Tile {
	private final String CARDS_CONTENT[] = {"CITY","CITY","CITY","CITY","CITY","CITY","PLAIN","PLAIN","PLAIN","PLAIN","PLAIN","PLAIN","PLAIN"};

	public PlainCity () {
		super(Direction.NORTH, new Position(0, 0));
		this.id = 13;
		this.name = "PLAIN_CITY";

		for (int i = 0; i < Direction.NUMBER_OF_DIRECTIONS; ++i) 
			this.nodes[i] = new Node(CARDS_CONTENT[i], this);

		this.nodes[0].connection(this.nodes[1]);
		this.nodes[1].connection(this.nodes[2]);
		this.nodes[2].connection(this.nodes[3]);
		this.nodes[3].connection(this.nodes[4]);
		this.nodes[4].connection(this.nodes[5]);
		this.nodes[6].connection(this.nodes[7]);
		this.nodes[7].connection(this.nodes[8]);
		this.nodes[8].connection(this.nodes[9]);
		this.nodes[9].connection(this.nodes[10]);
		this.nodes[10].connection(this.nodes[11]);
		this.nodes[11].connection(this.nodes[12]);
	}
}
