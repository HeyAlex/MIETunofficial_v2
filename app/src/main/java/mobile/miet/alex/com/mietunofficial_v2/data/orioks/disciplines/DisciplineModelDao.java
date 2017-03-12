package mobile.miet.alex.com.mietunofficial_v2.data.orioks.disciplines;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.query.Query;
import org.greenrobot.greendao.query.QueryBuilder;

import java.util.List;

import mobile.miet.alex.com.mietunofficial_v2.data.DaoSession;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table "DISCIPLINE_MODEL".
*/
public class DisciplineModelDao extends AbstractDao<DisciplineModel, Integer> {

    public static final String TABLENAME = "DISCIPLINE_MODEL";

    /**
     * Properties of entity DisciplineModel.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property IdLink = new Property(0, Integer.class, "idLink", true, "ID_LINK");
        public final static Property ItogName = new Property(1, String.class, "itogName", false, "ITOG_NAME");
        public final static Property Name = new Property(2, String.class, "name", false, "NAME");
        public final static Property BallPoints = new Property(3, Float.class, "ballPoints", false, "BALL_POINTS");
        public final static Property MinBall = new Property(4, Float.class, "minBall", false, "MIN_BALL");
        public final static Property MaxBall = new Property(5, Float.class, "maxBall", false, "MAX_BALL");
        public final static Property MarkPoints = new Property(6, Integer.class, "markPoints", false, "MARK_POINTS");
        public final static Property IdDis = new Property(7, Integer.class, "idDis", false, "ID_DIS");
        public final static Property Preps = new Property(8, String.class, "preps", false, "PREPS");
        public final static Property Numst = new Property(9, int.class, "numst", false, "NUMST");
    }

    private DaoSession daoSession;

    private Query<DisciplineModel> userModel_DisciplinesQuery;

    public DisciplineModelDao(DaoConfig config) {
        super(config);
    }
    
    public DisciplineModelDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"DISCIPLINE_MODEL\" (" + //
                "\"ID_LINK\" INTEGER PRIMARY KEY ," + // 0: idLink
                "\"ITOG_NAME\" TEXT," + // 1: itogName
                "\"NAME\" TEXT," + // 2: name
                "\"BALL_POINTS\" REAL," + // 3: ballPoints
                "\"MIN_BALL\" REAL," + // 4: minBall
                "\"MAX_BALL\" REAL," + // 5: maxBall
                "\"MARK_POINTS\" INTEGER," + // 6: markPoints
                "\"ID_DIS\" INTEGER," + // 7: idDis
                "\"PREPS\" TEXT," + // 8: preps
                "\"NUMST\" INTEGER NOT NULL );"); // 9: numst
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"DISCIPLINE_MODEL\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, DisciplineModel entity) {
        stmt.clearBindings();
 
        Integer idLink = entity.getIdLink();
        if (idLink != null) {
            stmt.bindLong(1, idLink);
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
 
        Integer idDis = entity.getIdDis();
        if (idDis != null) {
            stmt.bindLong(8, idDis);
        }
 
        String preps = entity.getPreps();
        if (preps != null) {
            stmt.bindString(9, preps);
        }
        stmt.bindLong(10, entity.getNumst());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, DisciplineModel entity) {
        stmt.clearBindings();
 
        Integer idLink = entity.getIdLink();
        if (idLink != null) {
            stmt.bindLong(1, idLink);
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
 
        Integer idDis = entity.getIdDis();
        if (idDis != null) {
            stmt.bindLong(8, idDis);
        }
 
        String preps = entity.getPreps();
        if (preps != null) {
            stmt.bindString(9, preps);
        }
        stmt.bindLong(10, entity.getNumst());
    }

    @Override
    protected final void attachEntity(DisciplineModel entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    @Override
    public Integer readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0);
    }    

    @Override
    public DisciplineModel readEntity(Cursor cursor, int offset) {
        DisciplineModel entity = new DisciplineModel( //
            cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0), // idLink
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // itogName
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // name
            cursor.isNull(offset + 3) ? null : cursor.getFloat(offset + 3), // ballPoints
            cursor.isNull(offset + 4) ? null : cursor.getFloat(offset + 4), // minBall
            cursor.isNull(offset + 5) ? null : cursor.getFloat(offset + 5), // maxBall
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6), // markPoints
            cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7), // idDis
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // preps
            cursor.getInt(offset + 9) // numst
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, DisciplineModel entity, int offset) {
        entity.setIdLink(cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0));
        entity.setItogName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setBallPoints(cursor.isNull(offset + 3) ? null : cursor.getFloat(offset + 3));
        entity.setMinBall(cursor.isNull(offset + 4) ? null : cursor.getFloat(offset + 4));
        entity.setMaxBall(cursor.isNull(offset + 5) ? null : cursor.getFloat(offset + 5));
        entity.setMarkPoints(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
        entity.setIdDis(cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7));
        entity.setPreps(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setNumst(cursor.getInt(offset + 9));
     }
    
    @Override
    protected final Integer updateKeyAfterInsert(DisciplineModel entity, long rowId) {
        return entity.getIdLink();
    }
    
    @Override
    public Integer getKey(DisciplineModel entity) {
        if(entity != null) {
            return entity.getIdLink();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(DisciplineModel entity) {
        return entity.getIdLink() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
    /** Internal query to resolve the "disciplines" to-many relationship of UserModel. */
    public List<DisciplineModel> _queryUserModel_Disciplines(int numst) {
        synchronized (this) {
            if (userModel_DisciplinesQuery == null) {
                QueryBuilder<DisciplineModel> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.Numst.eq(null));
                userModel_DisciplinesQuery = queryBuilder.build();
            }
        }
        Query<DisciplineModel> query = userModel_DisciplinesQuery.forCurrentThread();
        query.setParameter(0, numst);
        return query.list();
    }

}