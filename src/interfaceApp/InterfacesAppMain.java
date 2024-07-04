package interfaceApp;

import interfaces.*;

public class InterfacesAppMain {

    public static void start() {

        System.out.println("- - START - -");

        // drawButtons
        Button newContact = new Button("New Contact");
        Button call = new Button("Call");

        // set functions
        newContact.setCallBack(newContactCallBack);

        call.setCallBack(new CallBack() {
            @Override
            public void onClick() {
                call("");
            }

            @Override
            public void longClick(int sec) {

            }
        });

    }


    private static CallBack callingCallBack = new CallBack() {
        @Override
        public void onClick() {
            call("+972525555555");
        }

        @Override
        public void longClick(int sec) {

        }


    };

    private static CallBack newContactCallBack = new CallBack() {
        @Override
        public void onClick() {
            openContactEditor(null);
        }

        @Override
        public void longClick(int sec) {

        }


    };

    private static CallBack contactCallBack = new CallBack() {
        @Override
        public void onClick() {
            openContactEditor("12131321");
        }

        @Override
        public void longClick(int sec) {
            if (sec > 3) {

            } else if (sec > 1) {

            }
        }


        private void openMenu(String number) {

        }
    };



    private static void call(String phoneNumber) {
        // ring ring
    }

    private static void openContactEditor(String contactId) {
        //
    }


}
