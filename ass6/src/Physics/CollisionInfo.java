// 207875089 Roi Shukrun

package Physics;

import Geometric.Point;

/**
 * Collision info.
 * @author Roi Shukrun <address>roee.shukrun@live.biu.ac.il</address>
 * @version 1.5
 * @since 2023 -03-30
 */
public class CollisionInfo {
    private final Point collisionPoint;
    private final Collidable collisionObject;

    /**
     * Instantiates a new Collision info.
     * @param collisionPoint the collision point
     * @param collisionObject the collision object
     */
    public CollisionInfo(Point collisionPoint, Collidable collisionObject) {
        this.collisionPoint = collisionPoint;
        this.collisionObject = collisionObject;
    }

    /**
     * Collision point.
     * Return the point at which the collision occurs.
     * @return the point
     */
    public Point collisionPoint() {
        return this.collisionPoint;
    }

    /**
     * Collision object collidable.
     * Return the collidable object involved in the collision.
     * @return the collidable
     */
    public Collidable collisionObject() {
        return this.collisionObject;
    }
}
