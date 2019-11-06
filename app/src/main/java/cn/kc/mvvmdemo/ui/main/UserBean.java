package cn.kc.mvvmdemo.ui.main;

import java.util.List;

/**
 * 作者： Abel .
 * 日期：2019/9/9
 * 说明：
 */
public class UserBean {

    /**
     * state : 1
     * message : ????
     * data : [{"ID":162,"ROLE_ID":51,"ROLE_TYPE":5,"USER_NAME":"245400","PASSWORD":"77FF1C530414E285","SALT":"6R80FD","AVATAR":null,"REAL_NAME":"???","TELEPHONE":null,"EMAIL":null,"IS_AUDIT":0,"IS_LOCK":0,"ADD_TIME":"2019-06-20T19:26:35","STYLE_NO":null,"EMPLOYEE_CODE_SBNO":"245400","COMMAND_RECEIVE":1}]
     */

    private String state;
    private String message;
    private List<DataBean> data;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * ID : 162
         * ROLE_ID : 51
         * ROLE_TYPE : 5
         * USER_NAME : 245400
         * PASSWORD : 77FF1C530414E285
         * SALT : 6R80FD
         * AVATAR : null
         * REAL_NAME : ???
         * TELEPHONE : null
         * EMAIL : null
         * IS_AUDIT : 0
         * IS_LOCK : 0
         * ADD_TIME : 2019-06-20T19:26:35
         * STYLE_NO : null
         * EMPLOYEE_CODE_SBNO : 245400
         * COMMAND_RECEIVE : 1
         */

        private int ID;
        private int ROLE_ID;
        private int ROLE_TYPE;
        private String USER_NAME;
        private String PASSWORD;
        private String SALT;
        private Object AVATAR;
        private String REAL_NAME;
        private Object TELEPHONE;
        private Object EMAIL;
        private int IS_AUDIT;
        private int IS_LOCK;
        private String ADD_TIME;
        private Object STYLE_NO;
        private String EMPLOYEE_CODE_SBNO;
        private int COMMAND_RECEIVE;

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public int getROLE_ID() {
            return ROLE_ID;
        }

        public void setROLE_ID(int ROLE_ID) {
            this.ROLE_ID = ROLE_ID;
        }

        public int getROLE_TYPE() {
            return ROLE_TYPE;
        }

        public void setROLE_TYPE(int ROLE_TYPE) {
            this.ROLE_TYPE = ROLE_TYPE;
        }

        public String getUSER_NAME() {
            return USER_NAME;
        }

        public void setUSER_NAME(String USER_NAME) {
            this.USER_NAME = USER_NAME;
        }

        public String getPASSWORD() {
            return PASSWORD;
        }

        public void setPASSWORD(String PASSWORD) {
            this.PASSWORD = PASSWORD;
        }

        public String getSALT() {
            return SALT;
        }

        public void setSALT(String SALT) {
            this.SALT = SALT;
        }

        public Object getAVATAR() {
            return AVATAR;
        }

        public void setAVATAR(Object AVATAR) {
            this.AVATAR = AVATAR;
        }

        public String getREAL_NAME() {
            return REAL_NAME;
        }

        public void setREAL_NAME(String REAL_NAME) {
            this.REAL_NAME = REAL_NAME;
        }

        public Object getTELEPHONE() {
            return TELEPHONE;
        }

        public void setTELEPHONE(Object TELEPHONE) {
            this.TELEPHONE = TELEPHONE;
        }

        public Object getEMAIL() {
            return EMAIL;
        }

        public void setEMAIL(Object EMAIL) {
            this.EMAIL = EMAIL;
        }

        public int getIS_AUDIT() {
            return IS_AUDIT;
        }

        public void setIS_AUDIT(int IS_AUDIT) {
            this.IS_AUDIT = IS_AUDIT;
        }

        public int getIS_LOCK() {
            return IS_LOCK;
        }

        public void setIS_LOCK(int IS_LOCK) {
            this.IS_LOCK = IS_LOCK;
        }

        public String getADD_TIME() {
            return ADD_TIME;
        }

        public void setADD_TIME(String ADD_TIME) {
            this.ADD_TIME = ADD_TIME;
        }

        public Object getSTYLE_NO() {
            return STYLE_NO;
        }

        public void setSTYLE_NO(Object STYLE_NO) {
            this.STYLE_NO = STYLE_NO;
        }

        public String getEMPLOYEE_CODE_SBNO() {
            return EMPLOYEE_CODE_SBNO;
        }

        public void setEMPLOYEE_CODE_SBNO(String EMPLOYEE_CODE_SBNO) {
            this.EMPLOYEE_CODE_SBNO = EMPLOYEE_CODE_SBNO;
        }

        public int getCOMMAND_RECEIVE() {
            return COMMAND_RECEIVE;
        }

        public void setCOMMAND_RECEIVE(int COMMAND_RECEIVE) {
            this.COMMAND_RECEIVE = COMMAND_RECEIVE;
        }
    }
}
