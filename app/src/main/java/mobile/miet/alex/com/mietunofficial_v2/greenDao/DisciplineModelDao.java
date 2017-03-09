package mobile.miet.alex.com.mietunofficial_v2.greenDao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table "DISCIPLINE_MODEL".
*/
public class DisciplineModelDao extends AbstractDao<DisciplineModel, String> {

    public static final String TABLENAME = "DISCIPLINE_MODEL";

    /**
     * Properties of entity DisciplineModel.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property IdLink = new Property(0, String.class, "idLink", true, "ID_LINK");
        public final static Property Itog_name = new Property(1, String.class, "itog_name", false, "ITOG_NAME");
        public final static Property Name = new Property(2, String.class, "name", false, "NAME");
        public final static Property Ball = new Property(3, String.class, "ball", false, "BALL");
        public final static Property Min_ball = new Property(4, String.class, "min_ball", false, "MIN_BALL");
        public final static Property Max_ball = new Property(5, String.class, "max_ball", false, "MAX_BALL");
        public final static Property Mark = new Property(6, String.class, "mark", false, "MARK");
        public final static Property IdDis = new Property(7, String.class, "idDis", false, "ID_DIS");
        public final static Property Preps = new Property(8, String.class, "preps", false, "PREPS");
    }

    private DaoSession daoSession;


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
                "\"ID_LINK\" TEXT PRIMARY KEY NOT NULL ," + // 0: idLink
                "\"ITOG_NAME\" TEXT," + // 1: itog_name
                "\"NAME\" TEXT," + // 2: name
                "\"BALL\" TEXT," + // 3: ball
                "\"MIN_BALL\" TEXT," + // 4: min_ball
                "\"MAX_BALL\" TEXT," + // 5: max_ball
                "\"MARK\" TEXT," + // 6: mark
                "\"ID_DIS\" TEXT," + // 7: idDis
                "\"PREPS\" TEXT);"); // 8: preps
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"DISCIPLINE_MODEL\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, DisciplineModel entity) {
        stmt.clearBindings();
 
        String idLink = entity.getIdLink();
        if (idLink != null) {
            stmt.bindString(1, idLink);
        }
 
        String itog_name = entity.getItog_name();
        if (itog_name != null) {
            stmt.bindString(2, itog_name);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }
 
        String ball = entity.getBall();
        if (ball != null) {
            stmt.bindString(4, ball);
        }
 
        String min_ball = entity.getMin_ball();
        if (min_ball != null) {
            stmt.bindString(5, min_ball);
        }
 
        String max_ball = entity.getMax_ball();
        if (max_ball != null) {
            stmt.bindString(6, max_ball);
        }
 
        String mark = entity.getMark();
        if (mark != null) {
            stmt.bindString(7, mark);
        }
 
        String idDis = entity.getIdDis();
        if (idDis != null) {
            stmt.bindString(8, idDis);
        }
 
        String preps = entity.getPreps();
        if (preps != null) {
            stmt.bindString(9, preps);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, DisciplineModel entity) {
        stmt.clearBindings();
 
        String idLink = entity.getIdLink();
        if (idLink != null) {
            stmt.bindString(1, idLink);
        }
 
        String itog_name = entity.getItog_name();
        if (itog_name != null) {
            stmt.bindString(2, itog_name);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }
 
        String ball = entity.getBall();
        if (ball != null) {
            stmt.bindString(4, ball);
        }
 
        String min_ball = entity.getMin_ball();
        if (min_ball != null) {
            stmt.bindString(5, min_ball);
        }
 
        String max_ball = entity.getMax_ball();
        if (max_ball != null) {
            stmt.bindString(6, max_ball);
        }
 
        String mark = entity.getMark();
        if (mark != null) {
            stmt.bindString(7, mark);
        }
 
        String idDis = entity.getIdDis();
        if (idDis != null) {
            stmt.bindString(8, idDis);
        }
 
        String preps = entity.getPreps();
        if (preps != null) {
            stmt.bindString(9, preps);
        }
    }

    @Override
    protected final void attachEntity(DisciplineModel entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public DisciplineModel readEntity(Cursor cursor, int offset) {
        DisciplineModel entity = new DisciplineModel( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // idLink
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // itog_name
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // name
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // ball
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // min_ball
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // max_ball
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // mark
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // idDis
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8) // preps
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, DisciplineModel entity, int offset) {
        entity.setIdLink(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setItog_name(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setBall(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setMin_ball(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setMax_ball(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setMark(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setIdDis(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setPreps(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
     }
    
    @Override
    protected final String updateKeyAfterInsert(DisciplineModel entity, long rowId) {
        return entity.getIdLink();
    }
    
    @Override
    public String getKey(DisciplineModel entity) {
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
    
}
