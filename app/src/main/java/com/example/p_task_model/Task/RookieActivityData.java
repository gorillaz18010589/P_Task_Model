package com.example.p_task_model.Task;

public class RookieActivityData {

    /**
     * Part1Info : {"Bonus":0,"CellPhoneStatus":false,"EmailStatus":false,"BankAccountStatus":false,"NotDuplicateIP":false,"ClaimStatus":0}
     * Part2Info : {"Bonus":0,"DepositStatus":false,"WithdrawStatus":false,"ClaimStatus":0}
     * Part3Info : {"Bonus":0,"NeedDeposit":0,"NeedBetGameTypeName":null,"NeedBet":0,"DepositStatus":false,"BetStatus":false,"ClaimStatus":0}
     * Part4Info : {"Bonus":0,"NeedCumulativeDeposit":0,"NeedCumulativeBet":0,"CumulativeDepositStatus":false,"CumulativeBetStatus":false,"ClaimStatus":0}
     * RuleContent : null
     */

    private Part1InfoBean Part1Info;
    private Part2InfoBean Part2Info;
    private Part3InfoBean Part3Info;
    private Part4InfoBean Part4Info;
    private Object RuleContent;

    public Part1InfoBean getPart1Info() {
        return Part1Info;
    }

    public void setPart1Info(Part1InfoBean Part1Info) {
        this.Part1Info = Part1Info;
    }

    public Part2InfoBean getPart2Info() {
        return Part2Info;
    }

    public void setPart2Info(Part2InfoBean Part2Info) {
        this.Part2Info = Part2Info;
    }

    public Part3InfoBean getPart3Info() {
        return Part3Info;
    }

    public void setPart3Info(Part3InfoBean Part3Info) {
        this.Part3Info = Part3Info;
    }

    public Part4InfoBean getPart4Info() {
        return Part4Info;
    }

    public void setPart4Info(Part4InfoBean Part4Info) {
        this.Part4Info = Part4Info;
    }

    public Object getRuleContent() {
        return RuleContent;
    }

    public void setRuleContent(Object RuleContent) {
        this.RuleContent = RuleContent;
    }

    public static class Part1InfoBean {
        /**
         * Bonus : 0
         * CellPhoneStatus : false
         * EmailStatus : false
         * BankAccountStatus : false
         * NotDuplicateIP : false
         * ClaimStatus : 0
         */

        private int Bonus;
        private boolean CellPhoneStatus;
        private boolean EmailStatus;
        private boolean BankAccountStatus;
        private boolean NotDuplicateIP;
        private int ClaimStatus;

        public int getBonus() {
            return Bonus;
        }

        public void setBonus(int Bonus) {
            this.Bonus = Bonus;
        }

        public boolean isCellPhoneStatus() {
            return CellPhoneStatus;
        }

        public void setCellPhoneStatus(boolean CellPhoneStatus) {
            this.CellPhoneStatus = CellPhoneStatus;
        }

        public boolean isEmailStatus() {
            return EmailStatus;
        }

        public void setEmailStatus(boolean EmailStatus) {
            this.EmailStatus = EmailStatus;
        }

        public boolean isBankAccountStatus() {
            return BankAccountStatus;
        }

        public void setBankAccountStatus(boolean BankAccountStatus) {
            this.BankAccountStatus = BankAccountStatus;
        }

        public boolean isNotDuplicateIP() {
            return NotDuplicateIP;
        }

        public void setNotDuplicateIP(boolean NotDuplicateIP) {
            this.NotDuplicateIP = NotDuplicateIP;
        }

        public int getClaimStatus() {
            return ClaimStatus;
        }

        public void setClaimStatus(int ClaimStatus) {
            this.ClaimStatus = ClaimStatus;
        }
    }

    public static class Part2InfoBean {
        /**
         * Bonus : 0
         * DepositStatus : false
         * WithdrawStatus : false
         * ClaimStatus : 0
         */

        private int Bonus;
        private boolean DepositStatus;
        private boolean WithdrawStatus;
        private int ClaimStatus;

        public int getBonus() {
            return Bonus;
        }

        public void setBonus(int Bonus) {
            this.Bonus = Bonus;
        }

        public boolean isDepositStatus() {
            return DepositStatus;
        }

        public void setDepositStatus(boolean DepositStatus) {
            this.DepositStatus = DepositStatus;
        }

        public boolean isWithdrawStatus() {
            return WithdrawStatus;
        }

        public void setWithdrawStatus(boolean WithdrawStatus) {
            this.WithdrawStatus = WithdrawStatus;
        }

        public int getClaimStatus() {
            return ClaimStatus;
        }

        public void setClaimStatus(int ClaimStatus) {
            this.ClaimStatus = ClaimStatus;
        }
    }

    public static class Part3InfoBean {
        /**
         * Bonus : 0
         * NeedDeposit : 0
         * NeedBetGameTypeName : null
         * NeedBet : 0
         * DepositStatus : false
         * BetStatus : false
         * ClaimStatus : 0
         */

        private int Bonus;
        private int NeedDeposit;
        private Object NeedBetGameTypeName;
        private int NeedBet;
        private boolean DepositStatus;
        private boolean BetStatus;
        private int ClaimStatus;

        public int getBonus() {
            return Bonus;
        }

        public void setBonus(int Bonus) {
            this.Bonus = Bonus;
        }

        public int getNeedDeposit() {
            return NeedDeposit;
        }

        public void setNeedDeposit(int NeedDeposit) {
            this.NeedDeposit = NeedDeposit;
        }

        public Object getNeedBetGameTypeName() {
            return NeedBetGameTypeName;
        }

        public void setNeedBetGameTypeName(Object NeedBetGameTypeName) {
            this.NeedBetGameTypeName = NeedBetGameTypeName;
        }

        public int getNeedBet() {
            return NeedBet;
        }

        public void setNeedBet(int NeedBet) {
            this.NeedBet = NeedBet;
        }

        public boolean isDepositStatus() {
            return DepositStatus;
        }

        public void setDepositStatus(boolean DepositStatus) {
            this.DepositStatus = DepositStatus;
        }

        public boolean isBetStatus() {
            return BetStatus;
        }

        public void setBetStatus(boolean BetStatus) {
            this.BetStatus = BetStatus;
        }

        public int getClaimStatus() {
            return ClaimStatus;
        }

        public void setClaimStatus(int ClaimStatus) {
            this.ClaimStatus = ClaimStatus;
        }
    }

    public static class Part4InfoBean {
        /**
         * Bonus : 0
         * NeedCumulativeDeposit : 0
         * NeedCumulativeBet : 0
         * CumulativeDepositStatus : false
         * CumulativeBetStatus : false
         * ClaimStatus : 0
         */

        private int Bonus;
        private int NeedCumulativeDeposit;
        private int NeedCumulativeBet;
        private boolean CumulativeDepositStatus;
        private boolean CumulativeBetStatus;
        private int ClaimStatus;

        public int getBonus() {
            return Bonus;
        }

        public void setBonus(int Bonus) {
            this.Bonus = Bonus;
        }

        public int getNeedCumulativeDeposit() {
            return NeedCumulativeDeposit;
        }

        public void setNeedCumulativeDeposit(int NeedCumulativeDeposit) {
            this.NeedCumulativeDeposit = NeedCumulativeDeposit;
        }

        public int getNeedCumulativeBet() {
            return NeedCumulativeBet;
        }

        public void setNeedCumulativeBet(int NeedCumulativeBet) {
            this.NeedCumulativeBet = NeedCumulativeBet;
        }

        public boolean isCumulativeDepositStatus() {
            return CumulativeDepositStatus;
        }

        public void setCumulativeDepositStatus(boolean CumulativeDepositStatus) {
            this.CumulativeDepositStatus = CumulativeDepositStatus;
        }

        public boolean isCumulativeBetStatus() {
            return CumulativeBetStatus;
        }

        public void setCumulativeBetStatus(boolean CumulativeBetStatus) {
            this.CumulativeBetStatus = CumulativeBetStatus;
        }

        public int getClaimStatus() {
            return ClaimStatus;
        }

        public void setClaimStatus(int ClaimStatus) {
            this.ClaimStatus = ClaimStatus;
        }
    }
}
