package mobile.miet.alex.com.mietunofficial_v2.data.orioks.events;

import java.util.List;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.query.Query;
import org.greenrobot.greendao.query.QueryBuilder;

import mobile.miet.alex.com.mietunofficial_v2.data.DaoSession;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table "EVENT_MODEL".
*/
public class EventModelDao extends AbstractDao<EventModel, Integer> {

    public static final String TABLENAME = "EVENT_MODEL";

    /**
     * Properties of entity EventModel.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property IdDis = new Property(0, Integer.class, "idDis", true, "ID_DIS");
        public final static Property ItogName = new Property(1, String.class, "itogName", false, "ITOG_NAME");
        public final static Property Name = new Property(2, String.class, "name", false, "NAME");
        public final static Property BallPoints = new Property(3, Float.class, "ballPoints", false, "BALL_POINTS");
        public final static Property MinBall = new Property(4, Float.class, "minBall", false, "MIN_BALL");
        public final static Property MaxBall = new Property(5, Float.class, "maxBall", false, "MAX_BALL");
        public final static Property MarkPoints = new Property(6, Integer.class, "markPoints", false, "MARK_POINTS");
        public final static Property Sh = new Property(7, String.class, "sh", false, "SH");
        public final static Property Week = new Property(8, Integer.class, "week", false, "WEEK");
        public final static Property EnteredBy = new Property(9, String.class, "enteredBy", false, "ENTERED_BY");
        public final static Property IdLink = new Property(10, int.class, "idLink", false, "ID_LINK");
    }

    private Query<EventModel> disciplineModel_EventsQuery;

    public EventModelDao(DaoConfig config) {
        super(config);
    }
    
    public EventModelDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"EVENT_MODEL\" (" + //
                "\"ID_DIS\" INTEGER PRIMARY KEY ," + // 0: idDis
                "\"ITOG_NAME\" TEXT," + // 1: itogName
                "\"NAME\" TEXT," + // 2: name
                "\"BALL_POINTS\" REAL," + // 3: ballPoints
                "\"MIN_BALL\" REAL," + // 4: minBall
                "\"MAX_BALL\" REAL," + // 5: maxBall
                "\"MARK_POINTS\" INTEGER," + // 6: markPoints
                "\"SH\" TEXT," + // 7: sh
                "\"WEEK\" INTEGER," + // 8: week
                "\"ENTERED_BY\" TEXT," + // 9: enteredBy
                "\"ID_LINK\" INTEGER NOT NULL );"); // 10: idLink
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"EVENT_MODEL\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, EventModel entity) {
        stmt.clearBindings();
 
        Integer idDis = entity.getIdDis();
        if (idDis != null) {
            stmt.bindLong(1, idDis);
        }
 
        String itogName = entity.getItogName();
        if (itogName != null) {
            stmt.bindString(2, itogName);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }
 
        Float ballPoints = entity.getBallPoints();
        if (ballPoints != null) {
            stmt.bindDouble(4, ballPoints);
        }
 
        Float minBall = entity.getMinBall();
        if (minBall != null) {
            stmt.bindDouble(5, minBall);
        }
 
        Float maxBall = entity.getMaxBall();
        if (maxBall != null) {
            stmt.bindDouble(6, maxBall);
        }
 
        Integer markPoints = entity.getMarkPoints();
        if (markPoints != null) {
            stmt.bindLong(7, markPoints);
        }
 
        String sh = entity.getSh();
        if (sh != null) {
            stmt.bindString(8, sh);
        }
 
        Integer week = entity.getWeek();
        if (week != null) {
            stmt.bindLong(9, week);
        }
 
        String enteredBy = entity.getEnteredBy();
        if (enteredBy != null) {
            stmt.bindString(10, enteredBy);
        }
        stmt.bindLong(11, entity.getIdLink());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, EventModel entity) {
        stmt.clearBindings();
 
        Integer idDis = entity.getIdDis();
        if (idDis != null) {
            stmt.bindLong(1, idDis);
        }
 
        String itogName = entity.getItogName();
        if (itogName != null) {
            stmt.bindString(2, itogName);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }
 
        Float ballPoints = entity.getBallPoints();
        if (ballPoints != null) {
            stmt.bindDouble(4, ballPoints);
        }
 
        Float minBall = entity.getMinBall();
        if (minBall != null) {
            stmt.bindDouble(5, minBall);
        }
 
        Float maxBall = entity.getMaxBall();
        if (maxBall != null) {
            stmt.bindDouble(6, maxBall);
        }
 
        Integer markPoints = entity.getMarkPoints();
        if (markPoints != null) {
            stmt.bindLong(7, markPoints);
        }
 
        String sh = entity.getSh();
        if (sh != null) {
            stmt.bindString(8, sh);
        }
 
        Integer week = entity.getWeek();
        if (week != null) {
            stmt.bindLong(9, week);
        }
 
        String enteredBy = entity.getEnteredBy();
        if (enteredBy != null) {
            stmt.bindString(10, enteredBy);
        }
        stmt.bindLong(11, entity.getIdLink());
    }

    @Override
    public Integer readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0);
    }    

    @Override
    public EventModel readEntity(Cursor cursor, int offset) {
        EventModel entity = new EventModel( //
            cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0), // idDis
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // itogName
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // name
            cursor.isNull(offset + 3) ? null : cursor.getFloat(offset + 3), // ballPoints
            cursor.isNull(offset + 4) ? null : cursor.getFloat(offset + 4), // minBall
            cursor.isNull(offset + 5) ? null : cursor.getFloat(offset + 5), // maxBall
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6), // markPoints
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // sh
            cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8), // week
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // enteredBy
            cursor.getInt(offset + 10) // idLink
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, EventModel entity, int offset) {
        entity.setIdDis(cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0));
        entity.setItogName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setBallPoints(cursor.isNull(offset + 3) ? null : cursor.getFloat(offset + 3));
        entity.setMinBall(cursor.isNull(offset + 4) ? null : cursor.getFloat(offset + 4));
        entity.setMaxBall(cursor.isNull(offset + 5) ? null : cursor.getFloat(offset + 5));
        entity.setMarkPoints(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
        entity.setSh(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setWeek(cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8));
        entity.setEnteredBy(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setIdLink(cursor.getInt(offset + 10));
     }
    
    @Override
    protected final Integer updateKeyAfterInsert(EventModel entity, long rowId) {
        return entity.getIdDis();
    }
    
    @Override
    public Integer getKey(EventModel entity) {
        if(entity != null) {
            return entity.getIdDis();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(EventModel entity) {
        return entity.getIdDis() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
    /** Internal query to resolve the "events" to-many relationship of DisciplineModel. */
    public List<EventModel> _queryDisciplineModel_Events(int idLink) {
        synchronized (this) {
            if (disciplineModel_EventsQuery == null) {
                QueryBuilder<EventModel> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.IdLink.eq(null));
                disciplineModel_EventsQuery = queryBuilder.build();
            }
        }
        Query<EventModel> query = disciplineModel_EventsQuery.forCurrentThread();
        query.setParameter(0, idLink);
        return query.list();
    }

}
