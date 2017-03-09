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
 * DAO for table "USER_MODEL".
*/
public class UserModelDao extends AbstractDao<UserModel, Void> {

    public static final String TABLENAME = "USER_MODEL";

    /**
     * Properties of entity UserModel.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Numst = new Property(0, String.class, "numst", false, "NUMST");
        public final static Property Week = new Property(1, String.class, "week", false, "WEEK");
        public final static Property Firstname = new Property(2, String.class, "firstname", false, "FIRSTNAME");
        public final static Property Lastname = new Property(3, String.class, "lastname", false, "LASTNAME");
        public final static Property Lastlastname = new Property(4, String.class, "lastlastname", false, "LASTLASTNAME");
        public final static Property Napr = new Property(5, String.class, "napr", false, "NAPR");
        public final static Property Sem = new Property(6, String.class, "sem", false, "SEM");
    }


    public UserModelDao(DaoConfig config) {
        super(config);
    }
    
    public UserModelDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"USER_MODEL\" (" + //
                "\"NUMST\" TEXT," + // 0: numst
                "\"WEEK\" TEXT," + // 1: week
                "\"FIRSTNAME\" TEXT," + // 2: firstname
                "\"LASTNAME\" TEXT," + // 3: lastname
                "\"LASTLASTNAME\" TEXT," + // 4: lastlastname
                "\"NAPR\" TEXT," + // 5: napr
                "\"SEM\" TEXT);"); // 6: sem
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"USER_MODEL\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, UserModel entity) {
        stmt.clearBindings();
 
        String numst = entity.getNumst();
        if (numst != null) {
            stmt.bindString(1, numst);
        }
 
        String week = entity.getWeek();
        if (week != null) {
            stmt.bindString(2, week);
        }
 
        String firstname = entity.getFirstname();
        if (firstname != null) {
            stmt.bindString(3, firstname);
        }
 
        String lastname = entity.getLastname();
        if (lastname != null) {
            stmt.bindString(4, lastname);
        }
 
        String lastlastname = entity.getLastlastname();
        if (lastlastname != null) {
            stmt.bindString(5, lastlastname);
        }
 
        String napr = entity.getNapr();
        if (napr != null) {
            stmt.bindString(6, napr);
        }
 
        String sem = entity.getSem();
        if (sem != null) {
            stmt.bindString(7, sem);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, UserModel entity) {
        stmt.clearBindings();
 
        String numst = entity.getNumst();
        if (numst != null) {
            stmt.bindString(1, numst);
        }
 
        String week = entity.getWeek();
        if (week != null) {
            stmt.bindString(2, week);
        }
 
        String firstname = entity.getFirstname();
        if (firstname != null) {
            stmt.bindString(3, firstname);
        }
 
        String lastname = entity.getLastname();
        if (lastname != null) {
            stmt.bindString(4, lastname);
        }
 
        String lastlastname = entity.getLastlastname();
        if (lastlastname != null) {
            stmt.bindString(5, lastlastname);
        }
 
        String napr = entity.getNapr();
        if (napr != null) {
            stmt.bindString(6, napr);
        }
 
        String sem = entity.getSem();
        if (sem != null) {
            stmt.bindString(7, sem);
        }
    }

    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    @Override
    public UserModel readEntity(Cursor cursor, int offset) {
        UserModel entity = new UserModel( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // numst
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // week
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // firstname
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // lastname
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // lastlastname
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // napr
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6) // sem
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, UserModel entity, int offset) {
        entity.setNumst(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setWeek(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setFirstname(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setLastname(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setLastlastname(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setNapr(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setSem(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
     }
    
    @Override
    protected final Void updateKeyAfterInsert(UserModel entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    @Override
    public Void getKey(UserModel entity) {
        return null;
    }

    @Override
    public boolean hasKey(UserModel entity) {
        // TODO
        return false;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
